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

package com.eveonline.api.corporation;

import com.eveonline.api.ApiService;
import com.eveonline.api.LimitedApiKey;

/**
 * @author Dominik Eckelmann
 */
public interface CorporationSheetApi extends ApiService {

    /**
     * @param apiKey      Limited API key.
     * @param characterId Character of the corporation you want the sheet from.
     * @return a corporation sheet.
     */
    CorporationSheet getCorporationSheet(LimitedApiKey apiKey, int characterId);

    /**
     * @param apiKey            Limited API key.
     * @param corporationId     Id of the corporation to get the sheet from.
     * @return a corporation sheet from another corporation.
     */
    CorporationSheetShort getCorporationSheetShort(LimitedApiKey apiKey, int corporationId);
}
