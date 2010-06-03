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

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

public interface CorporationSheet extends ApiResult{

    int getCorporationID();

    String getCorporationName();

    /**
     * @return Corp Ticker, often used as a nickname. is 6 the max length for the corp ticker?
     */
    String getTicker();

    int getCeoId();

    String getCeoName();

    int getStationId();

    String getStationName();

    String getDescription();

    String getUrl();

    int getAllianceId();

    String getAllianceName();

    String getTaxRate();

    int getMemberCount();

    int getMemberLimit();

    int getShares();

    ApiListResult<Divisions> getDivisions();

    ApiListResult<WalletDivisions> getWalletDivisions();

    Logo getLogo();
}
