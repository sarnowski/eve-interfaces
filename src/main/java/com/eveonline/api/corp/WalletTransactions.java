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

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

import java.util.Date;

/**
 * @author Tobias Sarnowski
 * @author Dominik Eckelmann
 */
public interface WalletTransactions<T extends WalletTransactions.Transaction> extends ApiListResult<T> {

    interface Transaction extends ApiResult {

        /**
         * @return when the transaction happened
         */
        Date getTransactionDate();

        /**
         * @return the transaction's ID
         */
        long getId();

        /**
         * @return how much was transfered
         */
        long getQuantity();

        /**
         * @return name of the transfered item
         */
        String getTypeName();

        /**
         * @return typeID of the transfered item
         */
        long getTypeID();

        /**
         * @return the price in ISK*100
         */
        long getPrice();

        /**
         * @return the client's character ID
         */
        long getClientId();

        /**
         * @return the client's character name
         */
        String getClientName();

        /**
         * @return the character's ID
         */
        long getCharacterId();

        /**
         * @return the character's name
         */
        String getCharacterName();

        /**
         * @return the station's ID
         */
        long getStationId();

        /**
         * @return the station's name
         */
        String getStationName();

        /**
         * @return the transaction type
         */
        String getTransactionType();

        /**
         * @return
         */
        String getTransactionFor();

    }

}
