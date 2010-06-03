/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
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
