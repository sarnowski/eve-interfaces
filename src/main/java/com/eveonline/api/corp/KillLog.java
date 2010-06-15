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
public interface KillLog<K extends KillLog.Kill> extends ApiListResult<K> {

    interface Kill extends ApiResult {

        /**
         * Unique kill id.
         *
         * You can use this id as beforeKillId in {@link KillLogApi#getKillLogs(com.eveonline.api.DirectorApiKey, long, long)}.
         * @return unique id of the kill.
         */
        long getId();

        /**
         * @return The ID of the solar system the kill occurred in.
         */
        long getSolarSystem();

        /**
         * @return Time the kill occurred.
         */
        Date getKillTime();

        /**
         * Moon location id.
         *
         * Normally populated on a POS los. It is not guaranteed it is present.
         *
         * @return Moon location id.
         */
        long getMoonId();

        /**
         * @return get the Victim information.
         */
        Victim getVictim();

        /**
         * @return get Attacker information.
         */
        ApiListResult<? extends Attacker> getAttackers();

        /**
         * @return Item the victim carried.
         */
        ApiListResult<? extends Item> getItems();

    }


    interface Attacker extends ApiResult {

        /**
         * @return ID of the attacker.
         */
        long getCharacterId();

        /**
         * @return Name of the attacker.
         */
        String getCharacterName();

        /**
         * @return Corporation id of the attacker's corporation.
         */
        long getCorporationId();

        /**
         * @return Corporation name of the attacker.
         */
        String getCorporationName();

        /**
         * @return the alliance id of the attacker.
         */
        long getAllianceId();

        /**
         * @return the attackers alliance name.
         */
        String getAllianceName();

        /**
         * @return security status of the attacker.
         */
        float getSecurityStatus();

        /**
         * @return damage done by the attacker.
         */
        long getDamageDone();

        /**
         * @return indicates if he lead the final blow.
         */
        boolean hadFinalBlow();

        /**
         * @return Weapon ID the attacker use. Sometimes it can be a ship or missile.
         */
        long getWeaponTypeId();

        /**
         * @return ship of the attacker.
         */
        long getShipTypeId();

    }


    interface Item extends ApiResult {

        /**
         * @return the item id.
         */
        long getTypeId();

        /**
         * @return Inventory flags of the item.
         */
        int getFlag();

        /**
         * @return how much of the items dropped.
         */
        long getQuantityDropped();

        /**
         * @return how much of the item get destroyed.
         */
        long getQuantityDestroyed();

        /**
         * @return get the items that contains other items.
         */
        ApiListResult<? extends Item> getContainingItems();

    }


    interface Victim extends ApiResult {

        /**
         * @return the victim's character id.
         */
        long getCharacterId();

        /**
         * @return the victim's name.
         */
        String getCharacterName();

        /**
         * @return the victim's corporation id.
         */
        long getCorporationId();

        /**
         * @return the victim's corporation name.
         */
        String getCorporationName();

        /**
         * @return the victim's alliance id.
         */
        long getAllianceId();

        /**
         * @return total amount of taken damage.
         */
        long getDamageTaken();

        /**
         * @return destroyed ship of the victim.
         */
        long getShipTypeId();

    }
}
