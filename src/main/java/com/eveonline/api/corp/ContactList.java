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

/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.corp;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

/**
 * @author Dominik Eckelmann
 * @author Tobias Sarnowski
 */
public interface ContactList extends ApiResult {

    /**
     * @return list of contacts of the character's corporation
     */
    ApiListResult<? extends Contact> getCorporationContacts();

    /**
     * @return list of contacts of the character's alliance
     */
    ApiListResult<? extends Contact> getAllianceContacts();


    interface Contact extends ApiResult {
        /**
         * @return Contact ID - depending on the contact list.
         */
        long getId();

        /**
         * @return The contact's name.
         */
        String getName();

        /**
         * @return the standing to the contact *10.
         */
        int getStanding();
    }
}
