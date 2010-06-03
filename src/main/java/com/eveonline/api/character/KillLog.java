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
public interface KillLog extends ApiResult {

	int getKillId();

	int getSolarSystem();

	Date getKillTime();

	int getMoonId();

	Victim getVictim();

	ApiListResult<Attacker> getAttackers();

	ApiListResult<Item> getItems();

	/**
	 * @author Tobias Sarnowski
	 */
	interface Attacker extends ApiResult {

		int getCharacterId();

		String getCharacterName();

		int getCorporationId();

		String getCorporationName();

		int getAllianceId();

		String getAllianceName();

		float getSecurityStatus();

		int getDamageDone();

		boolean hadFinalBlow();

		int getWeaponTypeId();

		int getShipTypeId();

	}

	/**
	 * @author Tobias Sarnowski
	 */
	interface Item extends ApiResult {

		int getTypeId();

		int getFlag();

		int getQuantityDropped();

		int getQuantityDestroyed();

		ApiListResult<Item> getContainingItems();

	}

	/**
	 * @author Tobias Sarnowski
	 */
	interface Victim extends ApiResult {

		int getCharacterId();

		String getCharacterName();

		int getCorporationId();

		String getCorporationName();

		int getAllianceId();

		int getDamageTaken();

		int getShipTypeId();

	}
}
