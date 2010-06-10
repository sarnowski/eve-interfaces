/**
 * Copyright 2010 Tobias Sarnowski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

import java.util.Date;
import java.util.List;

/**
 * @author Tobias Sarnowski
 */
public interface MailMessages<M extends MailMessages.Mail> extends ApiListResult<M> {

	interface Mail extends ApiResult {

		/**
		 * @return the mail's ID
		 */
		long getId();

		/**
		 * @return the sender's ID
		 */
		long getSenderId();

		/**
		 * @return date, when the message was sent
		 */
		Date getSentDate();

		/**
		 * @return the mail's title
		 */
		String getTitle();

		/**
		 * @return if the mail was sent to a corporation or alliance, this is the ID
		 */
		long toCorporationOrAllianceId();

		/**
		 * @return list of receiver's
		 */
		List<Long> toCharacterIds();

		/**
		 * @return list of mailinglists
		 */
		List<Long> toListIds();

		/**
		 * @return if the message is already read
		 */
		boolean isRead();

	}

}
