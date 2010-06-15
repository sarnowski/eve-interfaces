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

import com.eveonline.api.ApiService;
import com.eveonline.api.FullApiKey;
import com.eveonline.api.exceptions.ApiException;

/**
 * @author Tobias Sarnowski
 */
public interface WalletTransactionsApi extends ApiService {

	public static final String XMLPATH = "/char/WalletTransactions.xml.aspx";


	/**
	 * @param key the full api key
	 * @param characterId the character's ID
	 * @return all wallet transactions
	 * @throws ApiException if an error occurs
	 */
	WalletTransactions getWalletTransactions(FullApiKey key, long characterId) throws ApiException;

	/**
	 * @param key the full api key
	 * @param characterId the character's ID
     * @param beforeTransactionId list of transaction before this ID
	 * @return all wallet transactions
	 * @throws ApiException if an error occurs
	 */
	WalletTransactions getWalletTransactions(FullApiKey key, long characterId, long beforeTransactionId) throws ApiException;

}
