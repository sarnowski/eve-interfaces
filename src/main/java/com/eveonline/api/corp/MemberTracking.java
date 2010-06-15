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
public interface MemberTracking<M extends MemberTracking.Member> extends ApiListResult<M> {

    interface Member extends ApiResult {

        /**
         * @return the character's ID
         */
        long getId();

        /**
         * @return the character's name
         */
        String getName();

        /**
         * @return when the character joined
         */
        Date getStartDateTime();

        /**
         * @return the character's base ID
         */
        long getBaseId();

        /**
         * @return the character's base name
         */
        String getBase();

        /**
         * @return the character's title
         */
        String getTitle();

        /**
         * @return when the character logged in the last time
         */
        Date getLogonDateTime();

        /**
         * @return when the character logged off the last time
         */
        Date getLogoffDateTime();

        /**
         * @return where the character is
         */
        long getLocationId();

        /**
         * @return where the character is
         */
        String getLocation();

        /**
         * @return which ship the character flies
         */
        long getShipTypeId();

        /**
         * @return which ship the character flies
         */
        String getShipType();

        /**
         * @return which roles the character has
         */
        long getRoles();

        /**
         * @return which grantable roles the character has
         */
        long getGrantableRoles();
    }
}
