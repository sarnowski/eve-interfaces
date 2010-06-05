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

	/**
	 * @return statistics about the top100 players
	 */
	Characters getCharacters();

	/**
	 * @return statistics about the top100 corporations
	 */
	Corporations getCorporations();

	/**
	 * @return statistics about the factions
	 */
	Factions getFactions();


	interface Characters extends ApiResult {

		/**
		 * @return top100 killers yesterday
		 */
		ApiListResult<TopKiller> getKillsYesterday();

		/**
		 * @return top100 killers last week
		 */
		ApiListResult<TopKiller> getKillsLastWeek();

		/**
		 * @return top100 killers in total
		 */
		ApiListResult<TopKiller> getKillsTotal();

		/**
		 * @return top100 victory point gainer yesterday
		 */
		ApiListResult<TopScorer> getVictoryPointsYesterday();

		/**
		 * @return top100 victory point gainer last week
		 */
		ApiListResult<TopScorer> getVictoryPointsLastWeek();

		/**
		 * @return top100 victory point gainer in total
		 */
		ApiListResult<TopScorer> getVictoryTotal();

	}

	interface TopKiller extends ApiResult {

		/**
		 * @return the killer's character ID
		 */
		long getCharacterId();

		/**
		 * @return the killer's character name
		 */
		String getCharacterName();

		/**
		 * @return count of kills made by this player
		 */
		int getKills();

	}

	interface TopScorer extends ApiResult {

		/**
		 * @return the scorer's character ID
		 */
		long getCharacterId();

		/**
		 * @return the scorer's character name
		 */
		String getCharacterName();

		/**
		 * @return count of vitory points made by this player
		 */
		long getVictoryPoints();

	}

	interface Corporations extends ApiResult {

		/**
		 * @return top100 killer corporations yesterday
		 */
		ApiListResult<TopKillerCorporation> getKillsYesterday();

		/**
		 * @return top100 killer corporations last week
		 */
		ApiListResult<TopKillerCorporation> getKillsLastWeek();

		/**
		 * @return top100 killer corporations in total
		 */
		ApiListResult<TopKillerCorporation> getKillsTotal();

		/**
		 * @return top100 scorer corporations yesterday
		 */
		ApiListResult<TopScorerCorporation> getVictoryPointsYesterday();

		/**
		 * @return top100 scorer corporations last week
		 */
		ApiListResult<TopScorerCorporation> getVictoryPointsLastWeek();

		/**
		 * @return top100 scorer corporations in total
		 */
		ApiListResult<TopScorerCorporation> getVictoryTotal();


	}

	interface TopKillerCorporation extends ApiResult {

		/**
		 * @return the killer corporation's ID
		 */
		long getCorporationId();

		/**
		 * @return the killer corporation's name
		 */
		String getCorporationName();

		/**
		 * @return count of kills made by this corporation
		 */
		int getKills();

	}

	interface TopScorerCorporation extends ApiResult {

		/**
		 * @return the scorer corporation's ID
		 */
		long getCorporationId();

		/**
		 * @return the scorer corporation's name
		 */
		String getCoprorationName();

		/**
		 * @return count of vicotry points made by this corporation
		 */
		long getVictoryPoints();

	}

	interface Factions extends ApiResult {

		/**
		 * @return top killer factions yesterday
		 */
		ApiListResult<TopKillerFaction> getKillsYesterday();

		/**
		 * @return top killer factions last week
		 */
		ApiListResult<TopKillerFaction> getKillsLastWeek();

		/**
		 * @return top killer factions in total
		 */
		ApiListResult<TopKillerFaction> getKillsTotal();

		/**
		 * @return top scorer factions yesterday
		 */
		ApiListResult<TopScorerFaction> getVictoryPointsYesterday();

		/**
		 * @return top scorer factions last week
		 */
		ApiListResult<TopScorerFaction> getVictoryPointsLastWeek();

		/**
		 * @return top scorer factions in total
		 */
		ApiListResult<TopScorerFaction> getVictoryTotal();


		interface TopKillerFaction extends ApiResult {

			/**
			 * @return the faction's ID
			 */
			long getFactionId();

			/**
			 * @return the faction's name
			 */
			String getFactionName();

			/**
			 * @return count of kills made by this faction
			 */
			long getKills();

		}

		interface TopScorerFaction extends ApiResult {

			/**
			 * @return the faction's ID
			 */
			long getFactionId();

			/**
			 * @return the faction's name
			 */
			String getFactionName();

			/**
			 * @return count of victory points made by this faction
			 */
			int getVictoryPoints();

		}

	}

}
