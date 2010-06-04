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

import com.eveonline.api.ApiResult;

import java.net.URL;

/**
 * @author Dominik Eckelmann
 */
public interface CorporationSheetShort extends ApiResult {

    /**
     * @return the corporation id.
     */
    int getCorporationID();

    /**
     * @return the corporation name.
     */
    String getCorporationName();

    /**
     * @return Corp Ticker, often used as a nickname.
     */
    String getTicker();

    /**
     * @return Character id of the CEO.
     */
    int getCeoId();

    /**
     * @return Name of the CEO.
     */
    String getCeoName();

    /**
     * @return HQ station id.
     */
    int getStationId();

    /**
     * @return HQ station name.
     */
    String getStationName();

    /**
     * @return Corporation description.
     */
    String getDescription();

    /**
     * @return Corporation homepage URL.
     */
    URL getUrl();

    /**
     * @return ID of the alliance the corporation belongs to.
     */
    int getAllianceId();

    /**
     * @return Name of the corporation's alliance.
     */
    String getAllianceName();

    /**
     * @return current tax rate.
     */
    float getTaxRate();

    /**
     * @return Current number of members.
     */
    int getMemberCount();

    /**
     * @return Shares outstanding.
     */
    int getShares();

    /**
     * @return Corporation logo.
     */
    CorporationSheetShort.Logo getLogo();

    /**
     * @author Dominik Eckelmann
     */
    public interface Logo extends ApiResult {

        /**
         * @return Corporation ID of the member corporation.
         */
        int getGraphicID();

        /**
         * @return shape ID
         */
        int getShape1();

        /**
         * @return shape ID
         */
        int getShape2();

        /**
         * @return shape ID
         */
        int getShape3();

        /**
         * @return color ID
         */
        int getColor1();

        /**
         * @return color ID
         */
        int getColor2();

        /**
         * @return color ID
         */
        int getColor3();
    }

}