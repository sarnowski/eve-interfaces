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
package com.eveonline.api.corporation;

import com.eveonline.api.ApiService;
import com.eveonline.api.FullApiKey;

/**
 * @author Dominik Eckelmann
 */
public interface ContactListApi extends ApiService {

    /**
     * @param apiKey        EVE-Api credentials.
     * @param characterId   CharacterId of a character in the corporation.
     * @return Contact list of corporation from the given character. 
     */
	Contact.ContactList getContactList(FullApiKey apiKey, int characterId);

}
