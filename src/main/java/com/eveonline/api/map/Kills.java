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
package com.eveonline.api.map;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

import java.util.Date;

/**
 * @author Tobias Sarnowski
 */
public interface Kills extends ApiListResult<Kills.SolarSystem> {

	/**
	 * @return when the list data was recorded
	 */
	Date getDataTime();


	interface SolarSystem extends ApiResult {

		/**
		 * @return the solar system's ID
		 */
		long getId();

		/**
		 * @return the kill count of the solar system
		 */
		int getShipKills();

		/**
		 * @return the faction kill count of the solar system
		 */
		int getFactionKills();

		/**
		 * @return the pod kill count of the solar system
		 */
		int getPodKills();

	}

}
