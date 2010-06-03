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
public interface FacWarTopStats extends ApiResult {

	Characters getCharacters();

	Corporations getCorporations();

	Factions getFactions();


	interface Characters extends ApiResult {

		ApiListResult<TopKiller> getKillsYesterday();

		ApiListResult<TopKiller> getKillsLastWeek();

		ApiListResult<TopKiller> getKillsTotal();

		ApiListResult<TopScorer> getVictoryPointsYesterday();

		ApiListResult<TopScorer> getVictoryPointsLastWeek();

		ApiListResult<TopScorer> getVictoryTotal();


		interface TopKiller extends ApiResult {

			int getCharacterId();

			String getCharacterName();

			int getKills();

		}

		interface TopScorer extends ApiResult {

			int getCharacterId();

			String getCharacterName();

			int getVictoryPoints();

		}

	}

	interface Corporations extends ApiResult {

		ApiListResult<TopKillerCorporation> getKillsYesterday();

		ApiListResult<TopKillerCorporation> getKillsLastWeek();

		ApiListResult<TopKillerCorporation> getKillsTotal();

		ApiListResult<TopScorerCorporation> getVictoryPointsYesterday();

		ApiListResult<TopScorerCorporation> getVictoryPointsLastWeek();

		ApiListResult<TopScorerCorporation> getVictoryTotal();


		interface TopKillerCorporation extends ApiResult {

			int getCorporationId();

			String getCorporationName();

			int getKills();

		}

		interface TopScorerCorporation extends ApiResult {

			int getCorporationId();

			String getCoprorationName();

			int getVictoryPoints();

		}

	}

	interface Factions extends ApiResult {

		ApiListResult<TopKillerFaction> getKillsYesterday();

		ApiListResult<TopKillerFaction> getKillsLastWeek();

		ApiListResult<TopKillerFaction> getKillsTotal();

		ApiListResult<TopScorerFaction> getVictoryPointsYesterday();

		ApiListResult<TopScorerFaction> getVictoryPointsLastWeek();

		ApiListResult<TopScorerFaction> getVictoryTotal();


		interface TopKillerFaction extends ApiResult {

			int getFactionId();

			String getFactionName();

			int getKills();

		}

		interface TopScorerFaction extends ApiResult {

			int getFactionId();

			String getFactionName();

			int getVictoryPoints();

		}

	}

}
