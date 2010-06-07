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

/**
 * @author Dominik Eckelmann
 */
public interface CorporationSheet extends CorporationSheetShort {

    /**
     * @return Current member limit.
     */
    int getMemberLimit();

    /**
     * @return Corporation divisions names.
     */
    ApiListResult<CorporationSheet.Division> getDivisions();

    /**
     * @return Corporation wallet division names.
     */
    ApiListResult<CorporationSheet.WalletDivision> getWalletDivisions();

    /**
     * @author Dominik Eckelmann
     */
    public interface Division extends ApiResult {

        /**
         * @return Division key. (corporation hangar id).
         */
       int getAccountKey();

        /**
         * @return Division name. (corporation hangar name.
         */
        String getDescription();
    }

    /**
     * @author Dominik Eckelmann
     */
    public interface WalletDivision extends ApiResult {

        /**
         * @return Wallet division key.
         */
        int getAccountKey();

        /**
         * @return Wallet division name.
         */
        String getDescription();
    }
}
