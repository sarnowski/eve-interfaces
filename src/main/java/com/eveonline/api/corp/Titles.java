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
 * @author Tobias Sarnowski
 * @author Dominik Eckelmann
 */
public interface Titles<T extends Titles.Title> extends ApiListResult<T> {

    interface Title extends ApiResult {

        /**
         * @return the title's ID
         */
        int getId();

        /**
         * @return the title's name
         */
        String getName();

        /**
         * @return list of roles
         */
        ApiListResult<? extends Role> getRoles();

        /**
         * @return list of roles
         */
        ApiListResult<? extends Role> getGrantableRoles();

        /**
         * @return list of roles
         */
        ApiListResult<? extends Role> getRolesAtHQ();

        /**
         * @return list of roles
         */
        ApiListResult<? extends Role> getGrantableRolesAtHQ();

        /**
         * @return list of roles
         */
        ApiListResult<? extends Role> getRolesAtBase();

        /**
         * @return list of roles
         */
        ApiListResult<? extends Role> getGrantableRolesAtBase();

        /**
         * @return list of roles
         */
        ApiListResult<? extends Role> getRolesAtOther();

        /**
         * @return list of roles
         */
        ApiListResult<? extends Role> getGrantableRolesAtOther();

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

        /**
         * @return the role's description
         */
        String getDescription();
    }
}
