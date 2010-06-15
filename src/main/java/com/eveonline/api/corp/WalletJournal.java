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
public interface WalletJournal<E extends WalletJournal.Entry> extends ApiListResult<E> {

    interface Entry extends ApiResult {

        /**
         * @return when the entry was
         */
        Date getDate();

        /**
         * @return the reference ID
         */
        long getRefId();

        /**
         * @return the reference typeID
         */
        long getRefTypeId();

        /**
         * @return get first owner's name
         */
        String getOwnerName1();

        /**
         * @return get first owner's ID
         */
        long getOwnerId1();

        /**
         * @return get second owner's name
         */
        String getOwnerName2();

        /**
         * @return get second owner's ID
         */
        long getOwnerId2();

        /**
         * @return get first owner's argument name
         */
        String getArgName1();

        /**
         * @return the amount
         */
        long getAmount();

        /**
         * @return the ISK *100
         */
        long getBallance();

        /**
         * @return the reason
         */
        String getReason();

    }
}
