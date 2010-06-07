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
public interface FacWarStats extends ApiResult {

	/**
	 * @return statistics about all faction wars in general
	 */
	Totals getTotals();

	/**
	 * @return a list of all factions in the war
	 */
	ApiListResult<? extends Faction> getFactions();

	/**
	 * @return a list of all wars
	 */
	ApiListResult<? extends FactionWar> getFactionWars();


	interface Totals extends ApiResult {

		/**
		 * @return kills made yesterday
		 */
		int getKillsYesterday();

		/**
		 * @return kills made in the last week
		 */
		int getKillsLastWeek();

		/**
		 * @return kills made in the whole time
		 */
		int getKillsTotal();

		/**
		 * @return victory points gained yesterday
		 */
		long getVictoryPointsYesterday();

		/**
		 * @return victory points gained in the last week
		 */
		long getVictoryPointsLastWeek();

		/**
		 * @return victory points gained in the whole time
		 */
		long getVictoryPointsTotal();

	}

	interface Faction extends ApiResult {

		/**
		 * @return the faction's ID
		 */
		int getId();

		/**
		 * @return the faction's name
		 */
		String getName();

		/**
		 * @return count of pilots, fighting for this faction
		 */
		int getPilots();

		/**
		 * @return count of systems, controlled by this faction
		 */
		int getSystemsControlled();

		/**
		 * @return kills made by this faction yesterday
		 */
		int getKillsYesterday();

		/**
		 * @return kills made by this faction last week
		 */
		int getKillsLastWeek();

		/**
		 * @return kills made by this faction in the whole time
		 */
		int getKillsTotal();

		/**
		 * @return victory points made by this faction yesterday
		 */
		long getVictoryPointsYesterday();

		/**
		 * @return victory points made by this faction last week
		 */
		long getVictoryPointsLastWeek();

		/**
		 * @return victory points made by this faction in the whole time
		 */
		long getVictoryPointsTotal();

	}

	interface FactionWar extends ApiResult {

		/**
		 * @return the fighting faction's ID
		 */
		long getFactionId();

		/**
		 * @return the fighting faction's name
		 */
		String getFactionName();

		/**
		 * @return the faction's ID, fighting against the first one
		 */
		int getAgainstId();

		/**
		 * @return the faction's name, fighting against the first one
		 */
		String getAgainstName();

	}
}
