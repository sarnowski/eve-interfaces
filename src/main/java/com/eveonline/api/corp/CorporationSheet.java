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
 * @author Dominik Eckelmann
 * @author Tobias Sarnowski
 */
public interface CorporationSheet extends ApiResult {

    /**
     * @return the corporation id.
     */
    long getId();

    /**
     * @return the corporation name.
     */
    String getName();

    /**
     * @return Corp Ticker, often used as a nickname.
     */
    String getTicker();

    /**
     * @return Character id of the CEO.
     */
    long getCeoId();

    /**
     * @return Name of the CEO.
     */
    String getCeoName();

    /**
     * @return HQ station id.
     */
    long getStationId();

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
    String getUrl();

    /**
     * @return ID of the alliance the corporation belongs to.
     */
    long getAllianceId();

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
    CorporationSheet.Logo getLogo();


    public interface Logo extends ApiResult {

        /**
         * @return Corporation ID of the member corporation.
         */
        long getGraphicID();

        /**
         * @return shape ID
         */
        long getShape1();

        /**
         * @return shape ID
         */
        long getShape2();

        /**
         * @return shape ID
         */
        long getShape3();

        /**
         * @return color ID
         */
        long getColor1();

        /**
         * @return color ID
         */
        long getColor2();

        /**
         * @return color ID
         */
        long getColor3();
    }


    interface NonpublicCorporationSheet extends CorporationSheet {

        /**
         * @return Current member limit.
         */
        int getMemberLimit();

        /**
         * @return Corporation divisions names.
         */
        ApiListResult<? extends Division> getDivisions();

        /**
         * @return Corporation wallet division names.
         */
        ApiListResult<? extends WalletDivision> getWalletDivisions();

    }


    public interface Division extends ApiResult {

        /**
         * @return Division key. (corporation hangar id).
         */
        int getAccountKey();

        /**
         * @return Division name. (corporation hangar name.
         */
        String getDescription();
    }


    public interface WalletDivision extends ApiResult {

        /**
         * @return Wallet division key.
         */
        int getAccountKey();

        /**
         * @return Wallet division name.
         */
        String getDescription();
    }
}