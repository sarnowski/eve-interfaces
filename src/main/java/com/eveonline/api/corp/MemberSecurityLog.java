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
public interface MemberSecurityLog<L extends MemberSecurityLog.Log> extends ApiListResult<L> {

    interface Log extends ApiResult {

        /**
         * @return when the change happened
         */
        Date getChangeTime();

        /**
         * @return the character's ID
         */
        long getCharacterId();

        /**
         * @return the character's name
         */
        String getCharacterName();

        /**
         * @return the issuer's ID
         */
        long getIssuerId();

        /**
         * @return the issuer's name
         */
        String getIssuerName();

        /**
         * @return the role type
         */
        String getRoleLocationType();

        /**
         * @return list of roles before the change
         */
        ApiListResult<? extends Role> getOldRoles();

        /**
         * @return list of roles after the change
         */
        ApiListResult<? extends Role> getNewRoles();
        
    }


    interface Role extends ApiResult {

        /**
         * @return the role's ID
         */
        long getId();

        /**
         * @return the role's name
         */
        String getName();

    }

}
