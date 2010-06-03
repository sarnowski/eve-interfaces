/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.eve;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface FacWarStats extends ApiResult {

	Totals getTotals();

	ApiListResult<Faction> getFactions();

	ApiListResult<FactionWar> getFactionWars();


	interface Totals extends ApiResult {

		int getKillsYesterday();

		int getKillsLastWeek();

		int getKillsTotal();

		int getVictoryPointsYesterday();

		int getVictoryPointsLastWeek();

		int getVictoryPointsTotal();

	}

	interface Faction extends ApiResult {

		int getFactionId();

		String getFactionName();

		int getPilots();

		int getSystemsControlled();

		int getKillsYesterday();

		int getKillsLastWeek();

		int getKillsTotal();

		int getVictoryPointsYesterday();

		int getVictoryPointsLastWeek();

		int getVictoryPointsTotal();

	}

	interface FactionWar extends ApiResult {

		int getFactionId();

		String getFactionName();

		int getAgainstId();

		String getAgainstName();

	}
}
