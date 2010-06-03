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
