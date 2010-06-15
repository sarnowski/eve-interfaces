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

public interface StarbaseList<S extends StarbaseList.Starbase> extends ApiListResult<S> {

    interface Starbase extends ApiResult {

        /**
         * @return the starbase's ID
         */
        long getId();

        /**
         * @return the starbase's typeID
         */
        long getTypeId();

        /**
         * @returnthe starbase's location
         */
        long getLocationId();

        /**
         * @return the starbase's moon ID
         */
        long getMoonId();

        /**
         * @return the starbase's state
         */
        int getState();

        /**
         * @return when the state changed to current
         */
        Date getStateTimestamp();

        /**

         * @return when the starbase went/goes online
         */
        Date getOnlineTimestamp();

    }

}
