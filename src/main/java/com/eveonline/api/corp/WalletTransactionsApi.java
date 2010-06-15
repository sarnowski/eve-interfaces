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

package com.eveonline.api.corp;

import com.eveonline.api.ApiResult;
import com.eveonline.api.FullApiKey;
import com.eveonline.api.exceptions.ApiException;

/**
 * @author Dominik Eckelmann
 * @author Tobias Sarnowski
 */
public interface WalletTransactionsApi extends ApiResult {

    public static final String XMLPATH = "/corp/WalletTransactions.xml.aspx";


    /**
     * @param apiKey the full api key
     * @param characterId the character's ID
     * @param accountKey the accountKey
     * @return the wallet transactions
     * @throws ApiException if an error occurs
     */
    WalletTransactions getWalletTransactions(FullApiKey apiKey, long characterId, int accountKey) throws ApiException;

    /**
     * @param apiKey the full api key
     * @param characterId the character's ID
     * @param accountKey the accountKey
     * @param beforeTransId list all transaction before this transaction ID
     * @return the wallet transactions
     * @throws ApiException if an error occurs
     */
    WalletTransactions getWalletTransactions(FullApiKey apiKey, long characterId, int accountKey, long beforeTransId) throws ApiException;

}
