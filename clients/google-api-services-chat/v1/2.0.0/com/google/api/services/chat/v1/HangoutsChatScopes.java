/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.chat.v1;

/**
 * Available OAuth 2.0 scopes for use with the Google Chat API.
 *
 * @since 1.4
 */
public class HangoutsChatScopes {

  /** Delete conversations and spaces owned by your organization and remove access to associated files in Google Chat. */
  public static final String CHAT_ADMIN_DELETE = "https://www.googleapis.com/auth/chat.admin.delete";

  /** View, add, update and remove members and managers in conversations owned by your organization. */
  public static final String CHAT_ADMIN_MEMBERSHIPS = "https://www.googleapis.com/auth/chat.admin.memberships";

  /** View members and managers in conversations owned by your organization. */
  public static final String CHAT_ADMIN_MEMBERSHIPS_READONLY = "https://www.googleapis.com/auth/chat.admin.memberships.readonly";

  /** View or edit display name, description, and other metadata for all Google Chat conversations owned by your organization. */
  public static final String CHAT_ADMIN_SPACES = "https://www.googleapis.com/auth/chat.admin.spaces";

  /** View display name, description, and other metadata for all Google Chat conversations owned by your organization. */
  public static final String CHAT_ADMIN_SPACES_READONLY = "https://www.googleapis.com/auth/chat.admin.spaces.readonly";

  /** On their own behalf, apps in Google Chat can delete conversations and spaces and remove access to associated files. */
  public static final String CHAT_APP_DELETE = "https://www.googleapis.com/auth/chat.app.delete";

  /** On their own behalf, apps in Google Chat can see, add, update, and remove members from conversations and spaces. */
  public static final String CHAT_APP_MEMBERSHIPS = "https://www.googleapis.com/auth/chat.app.memberships";

  /** On their own behalf, apps in Google Chat can create conversations and spaces and see or update their metadata (including history settings and access settings). */
  public static final String CHAT_APP_SPACES = "https://www.googleapis.com/auth/chat.app.spaces";

  /** On their own behalf, apps in Google Chat can create conversations and spaces. */
  public static final String CHAT_APP_SPACES_CREATE = "https://www.googleapis.com/auth/chat.app.spaces.create";

  /** Private Service: https://www.googleapis.com/auth/chat.bot. */
  public static final String CHAT_BOT = "https://www.googleapis.com/auth/chat.bot";

  /** View, create, and delete custom emoji in Google Chat. */
  public static final String CHAT_CUSTOMEMOJIS = "https://www.googleapis.com/auth/chat.customemojis";

  /** View custom emoji in Google Chat. */
  public static final String CHAT_CUSTOMEMOJIS_READONLY = "https://www.googleapis.com/auth/chat.customemojis.readonly";

  /** Delete conversations and spaces and remove access to associated files in Google Chat. */
  public static final String CHAT_DELETE = "https://www.googleapis.com/auth/chat.delete";

  /** Import spaces, messages, and memberships into Google Chat.. */
  public static final String CHAT_IMPORT = "https://www.googleapis.com/auth/chat.import";

  /** See, add, update, and remove members from conversations and spaces in Google Chat. */
  public static final String CHAT_MEMBERSHIPS = "https://www.googleapis.com/auth/chat.memberships";

  /** Add and remove itself from conversations and spaces in Google Chat. */
  public static final String CHAT_MEMBERSHIPS_APP = "https://www.googleapis.com/auth/chat.memberships.app";

  /** View members in Google Chat conversations.. */
  public static final String CHAT_MEMBERSHIPS_READONLY = "https://www.googleapis.com/auth/chat.memberships.readonly";

  /** See, compose, send, update, and delete messages as well as their message content; add, see, and delete reactions to messages.. */
  public static final String CHAT_MESSAGES = "https://www.googleapis.com/auth/chat.messages";

  /** Compose and send messages in Google Chat. */
  public static final String CHAT_MESSAGES_CREATE = "https://www.googleapis.com/auth/chat.messages.create";

  /** See, add, and delete reactions as well as their reaction content to messages in Google Chat. */
  public static final String CHAT_MESSAGES_REACTIONS = "https://www.googleapis.com/auth/chat.messages.reactions";

  /** Add reactions to messages in Google Chat. */
  public static final String CHAT_MESSAGES_REACTIONS_CREATE = "https://www.googleapis.com/auth/chat.messages.reactions.create";

  /** View reactions as well as their reaction content to messages in Google Chat. */
  public static final String CHAT_MESSAGES_REACTIONS_READONLY = "https://www.googleapis.com/auth/chat.messages.reactions.readonly";

  /** See messages as well as their reactions and message content in Google Chat. */
  public static final String CHAT_MESSAGES_READONLY = "https://www.googleapis.com/auth/chat.messages.readonly";

  /** Create conversations and spaces and see or update metadata (including history settings and access settings) in Google Chat. */
  public static final String CHAT_SPACES = "https://www.googleapis.com/auth/chat.spaces";

  /** Create new conversations and spaces in Google Chat. */
  public static final String CHAT_SPACES_CREATE = "https://www.googleapis.com/auth/chat.spaces.create";

  /** View chat and spaces in Google Chat. */
  public static final String CHAT_SPACES_READONLY = "https://www.googleapis.com/auth/chat.spaces.readonly";

  /** View and modify last read time for Google Chat conversations. */
  public static final String CHAT_USERS_READSTATE = "https://www.googleapis.com/auth/chat.users.readstate";

  /** View last read time for Google Chat conversations. */
  public static final String CHAT_USERS_READSTATE_READONLY = "https://www.googleapis.com/auth/chat.users.readstate.readonly";

  /** Read and update your space settings. */
  public static final String CHAT_USERS_SPACESETTINGS = "https://www.googleapis.com/auth/chat.users.spacesettings";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(CHAT_ADMIN_DELETE);
    set.add(CHAT_ADMIN_MEMBERSHIPS);
    set.add(CHAT_ADMIN_MEMBERSHIPS_READONLY);
    set.add(CHAT_ADMIN_SPACES);
    set.add(CHAT_ADMIN_SPACES_READONLY);
    set.add(CHAT_APP_DELETE);
    set.add(CHAT_APP_MEMBERSHIPS);
    set.add(CHAT_APP_SPACES);
    set.add(CHAT_APP_SPACES_CREATE);
    set.add(CHAT_BOT);
    set.add(CHAT_CUSTOMEMOJIS);
    set.add(CHAT_CUSTOMEMOJIS_READONLY);
    set.add(CHAT_DELETE);
    set.add(CHAT_IMPORT);
    set.add(CHAT_MEMBERSHIPS);
    set.add(CHAT_MEMBERSHIPS_APP);
    set.add(CHAT_MEMBERSHIPS_READONLY);
    set.add(CHAT_MESSAGES);
    set.add(CHAT_MESSAGES_CREATE);
    set.add(CHAT_MESSAGES_REACTIONS);
    set.add(CHAT_MESSAGES_REACTIONS_CREATE);
    set.add(CHAT_MESSAGES_REACTIONS_READONLY);
    set.add(CHAT_MESSAGES_READONLY);
    set.add(CHAT_SPACES);
    set.add(CHAT_SPACES_CREATE);
    set.add(CHAT_SPACES_READONLY);
    set.add(CHAT_USERS_READSTATE);
    set.add(CHAT_USERS_READSTATE_READONLY);
    set.add(CHAT_USERS_SPACESETTINGS);
    return java.util.Collections.unmodifiableSet(set);
  }

  private HangoutsChatScopes() {
  }
}
