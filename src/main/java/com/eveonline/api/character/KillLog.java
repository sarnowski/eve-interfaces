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
package com.eveonline.api.character;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

import java.util.Date;

/**
 * @author Tobias Sarnowski
 */
public interface KillLog<K extends KillLog.Kill> extends ApiListResult<K> {

	interface Kill extends ApiResult {

		/**
		 * @return the kill's ID
		 */
		long getId();

		/**
		 * @return the solar system's ID
		 */
		long getSolarSystem();

		/**
		 * @return the kill's time
		 */
		Date getKillTime();

		/**
		 * @return the moon's ID
		 */
		long getMoonId();

		/**
		 * @return the victim
		 */
		Victim getVictim();

		/**
		 * @return the attackers
		 */
		ApiListResult<? extends Attacker> getAttackers();

		/**
		 * @return the victim's items
		 */
		ApiListResult<? extends Item> getItems();
	}


	interface Attacker extends ApiResult {

		/**
		 * @return the attacker's ID
		 */
		long getId();

		/**
		 * @return the attacker's name
		 */
		String getName();

		/**
		 * @return the attacker's corporation ID
		 */
		long getCorporationId();

		/**
		 * @return the corporation's name
		 */
		String getCorporationName();

		/**
		 * @return the alliance ID
		 */
		long getAllianceId();

		/**
		 * @return the alliance name
		 */
		String getAllianceName();

		/**
		 * @return the attacker's security status
		 */
		float getSecurityStatus();

		/**
		 * @return number of damage done to the victim
		 */
		long getDamageDone();

		/**
		 * @return if the attacker had the final blow
		 */
		boolean hadFinalBlow();

		/**
		 * @return typeID of weapon used
		 */
		long getWeaponTypeId();

		/**
		 * @return typeIF of the ship
		 */
		long getShipTypeId();

	}

	interface Item extends ApiResult {

		/**
		 * @return the item's typeID
		 */
		long getTypeId();

		/**
		 * @return the item's invFlag
		 */
		int getFlag();

		/**
		 * @return count of dropped items
		 */
		long getQuantityDropped();

		/**
		 * @return count of destroyed items
		 */
		long getQuantityDestroyed();

		/**
		 * @return list of contained items
		 */
		ApiListResult<? extends Item> getContainingItems();

	}

	/**
	 * @author Tobias Sarnowski
	 */
	interface Victim extends ApiResult {

		/**
		 * @return the victim's ID
		 */
		long getId();

		/**
		 * @return the victim's name
		 */
		String getName();

		/**
		 * @return the corporation ID
		 */
		long getCorporationId();

		/**
		 * @return the corporation name
		 */
		String getCorporationName();

		/**
		 * @return the alliance ID
		 */
		long getAllianceId();

		/**
		 * @return damage taken on the loss
		 */
		long getDamageTaken();

		/**
		 * @return the ship's typeID
		 */
		long getShipTypeId();

	}
}
