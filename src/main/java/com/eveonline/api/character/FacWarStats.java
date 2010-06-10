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

import com.eveonline.api.ApiResult;

import java.util.Date;


/**
 * @author Tobias Sarnowski
 */
public interface FacWarStats extends ApiResult {

	/**
	 * @return the faction's ID the character belongs to
	 */
	long getFactionId();

	/**
	 * @return the faction's name
	 */
	String getFactionName();

	/**
	 * @return date, since the character is enlisted
	 */
	Date getEnlisted();

	/**
	 * @return the highest rank, reached by this character
	 */
	int getHighestRank();

	/**
	 * @return count of kills made yesterday
	 */
	int getKillsYesterday();

	/**
	 * @return count of kills made last week
	 */
	int getKillsLastWeek();

	/**
	 * @return count of kills made in total
	 */
	int getKillsTotal();

	/**
	 * @return count of victory points made yesterday
	 */
	long getVictoryPointsYesterday();

	/**
	 * @return count of victory points made last week
	 */
	int getVictoryPointsLastWeek();

	/**
	 * @return count of victory points made in total
	 */
	int getVictoryPointsTotal();

}
