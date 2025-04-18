set -ex
export repo_dir=$(realpath $(dirname "${BASH_SOURCE[0]}")/../../)
pushd "${repo_dir}/clients"

# We only test against the latest variant
readonly CURRENT_VARIANT="2.0.0"

# An optional argument to only compile libraries starting with this letter
starting_letter="$1"

# find all generated clients' pom.xml
find . -wholename "*${CURRENT_VARIANT}/pom.xml" -not -path '*/target/*' > pom_list_raw
cat pom_list_raw

# trim down to those starting with "${starting_letter}"
cat pom_list_raw | { grep "google-api-services-${starting_letter}"  || true; } > pom_list
cat pom_list


# format result to list of Maven modules
cat pom_list | cut -d'/' -f2-4 \
| sed 's/\(.*\)/<module>\1<\/module>/' > module_list
cat module_list

# produce a temporary pom with the modules
(echo "<project><modelVersion>4.0.0</modelVersion><groupId>temp</groupId><artifactId>temp</artifactId><version>1.0</version><packaging>pom</packaging><modules>"; cat module_list; echo "</modules></project>") > pom.xml
cat pom.xml

# use generated pom to test compilation
mvn clean compile -T 1.5C -Dmaven.testSkip=true -Denforcer.skip -fae --fail-at-end 2>&1 | tee out
cat out | grep 'rev20' | grep 's]' | { grep 'FAILURE' || true; } > errors
if [[ $(cat errors | wc -l) -gt 0 ]]; then
	echo "Compilation errors found in the following libraries:"
	cat errors
	# send to GH output
	if [[ -f "${GITHUB_OUTPUT}" ]]; then
	  echo "failed_libraries_${starting_letter}=$(cat errors | tr '\n' ',')" > "${GITHUB_OUTPUT}"
	fi
fi
echo "No compilation errors found"
