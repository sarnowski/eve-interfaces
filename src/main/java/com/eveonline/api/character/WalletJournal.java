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

/**
 * @author Tobias Sarnowski
 */
public interface WalletJournal<E extends WalletJournal.Entry> extends ApiListResult<E> {

	interface Entry extends ApiResult {

		/**
		 * @return date of the entry
		 */
		Date getDate();

		/**
		 * @return entry's ID
		 */
		long getRefId();

		/**
		 * @return entrie's typeID
		 */
		long getRefTypeId();

		/**
		 * @return name of the first owner
		 */
		String getFirstOwnerName();

		/**
		 * @return ID of the first owner
		 */
		long getFirstOwnerId();

		/**
		 * @return name of the second owner
		 */
		String getSecondOwnerName();

		/**
		 * @return ID of the second owner
		 */
		long getSecondOwnerId();

		/**
		 * @return the first argument name
		 */
		String getFirstArgumentName();

		/**
		 * @return the first argument's ID
		 */
		long getFirstArgumentId();

		/**
		 * @return amount of ISK*100
		 */
		long getAmount();

		/**
		 * @return balance of ISK*100
		 */
		long getBalance();

		/**
		 * @return the message
		 */
		String getReason();

		/**
		 * @return who got the tax
		 */
		long getTaxReceiverId();

		/**
		 * @return how big was the tax
		 */
		long getTaxAmount();

	}

}
