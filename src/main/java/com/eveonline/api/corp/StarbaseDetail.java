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
 * @author Dominik Eckelmann
 * @author Tobias Sarnowski
 */
public interface StarbaseDetail extends ApiResult {

    /**
     * @return the starbase's state
     */
    int getState();

    /**
     * @return when the current state started
     */
    Date getStateTimestamp();

    /**
     * @return when the starbase went/goes online
     */
    Date getOnlineTimestamp();

    /**
     * @return informations about the general settings
     */
    GeneralSettings getGeneralSettings();

    /**
     * @return informations about the combat settings
     */
    CombatSettings getCombatSettings();

    /**
     * @return list of fuel for the starbase
     */
    ApiListResult<? extends Fuel> getFuels();


    interface GeneralSettings extends ApiResult {

        /**
         * @return flags about the usage
         */
        int getUsageFlags();

        /**
         * @return flags about the deployment
         */
        int getDeployFlags();

        /**
         * @return if corporation members are allowed to interact
         */
        boolean allowCorporationMembers();

        /**
         * @return if alliance members are allowed to interact
         */
        boolean allowAllianceMembers();
    }


    interface CombatSettings extends ApiResult{

        /**
         * @return required standings
         */
        float getUseStandingsFromOwner();

        /**
         * @return
         */
        int getOnStandingDrop();

        /**
         * @return
         */
        int isOnStatusDrop();

        /**
         * @return
         */
        int getOnStatusDrop();

        /**
         * @return
         */
        boolean isOnAggression();

        /**
         * @return
         */
        boolean isOnCorporationWar();

    }


    interface Fuel extends ApiResult{

        /**
         * @return the fuel's typeID
         */
        long getTypeId();

        /**
         * @return amount of fuel
         */
        long getQuantity();
    }
}
