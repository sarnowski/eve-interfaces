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
public interface WalletTransactions<T extends WalletTransactions.Transaction> extends ApiListResult<T> {

	interface Transaction extends ApiResult {

		/**
		 * @return the transaciton's date
		 */
		Date getDate();

		/**
		 * @return the transaction's ID
		 */
		long getId();

		/**
		 * @return transaction count
		 */
		long getQuantity();

		/**
		 * @return the the type's name
		 */
		String getTypeName();

		/**
		 * @return the typeID
		 */
		long getTypeId();

		/**
		 * @return price ISK*100
		 */
		long getPrice();

		/**
		 * @return the client's ID
		 */
		long getClientId();

		/**
		 * @return the client's name
		 */
		String getClientName();

		/**
		 * @return the station's ID
		 */
		long getStationId();

		/**
		 * @return the station's name
		 */
		String getStationName();

		/**
		 * @return the type of transaction
		 */
		String getTransactionType();

		/**
		 * @return what's the reason
		 */
		String getTransactionFor();

	}

}
