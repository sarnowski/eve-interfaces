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
package com.eveonline.api.eve;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

import java.util.Date;

/**
 * @author Tobias Sarnowski
 */
public interface AllianceList<A extends AllianceList.Alliance> extends ApiListResult<A> {

    interface Alliance extends ApiResult {

        /**
         * @return the alliance ID
         */
        long getId();

        /**
         * @return the alliance name
         */
        String getName();

        /**
         * @return the short name aka tag of the alliance
         */
        String getShortName();

        /**
         * @return ID of the executor corporation
         */
        long getExecutorCorporationId();

        /**
         * @return count of members in the alliance
         */
        int getMemberCount();

        /**
         * @return date, when the alliance was founded
         */
        Date getStartDate();

        /**
         * @return list of corporations in the alliance
         */
        ApiListResult<? extends Corporation> getCorporations();

    }


    interface Corporation extends ApiResult {

        /**
         * @return the corporation's ID
         */
        long getId();

        /**
         * @return the corporation's founding date
         */
        Date getStartDate();

    }

}
