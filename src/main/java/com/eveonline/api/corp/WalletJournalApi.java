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

import com.eveonline.api.ApiService;
import com.eveonline.api.FullApiKey;
import com.eveonline.api.exceptions.ApiException;

/**
 * @author Dominik Eckelmann
 * @author Tobias Sarnowski
 */
public interface WalletJournalApi extends ApiService {

    public static final String XMLPATH = "/corp/WalletJournal.xml.aspx";


    /**
     * @param apiKey api credentials
     * @param characterId characterID of character with Junior Accountant or higher role. 
     * @param accountKey Use /corp/AccountBalance.xml.aspx to determine which accountKey corresponds to each corporate wallet.
     * @return the wallet journal
     * @throws ApiException if an error occurs
     */
    WalletJournal getWalletJournal(FullApiKey apiKey, long characterId, int accountKey) throws ApiException;

    /**
     * @param apiKey api credentials
     * @param characterId characterID of character with Junior Accountant or higher role.
     * @param accountKey Use /corp/AccountBalance.xml.aspx to determine which accountKey corresponds to each corporate wallet.
     * @param beforeRefId Used for walking the journal backwards to get more entries; see Journal Walking, below. 
     * @return the wallet journal
     * @throws ApiException if an error occurs
     */
    WalletJournal getWalletJournal(FullApiKey apiKey, long characterId, int accountKey, long beforeRefId) throws ApiException;

}
