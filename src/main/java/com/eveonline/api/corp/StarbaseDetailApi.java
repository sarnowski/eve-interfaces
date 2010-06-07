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

import com.eveonline.api.DirectorApiKey;
import com.eveonline.api.exceptions.ApiException;

/**
 * @author Dominik Eckelmann
 * @author Tobias Sarnowski
 */
public interface StarbaseDetailApi {

    StarbaseDetail getStarbaseDetail(DirectorApiKey apiKey, int characterId, int itemId) throws ApiException;
	
}