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

/**
 * @author Tobias Sarnowski
 */
public interface Standings extends ApiResult {

	/**
	 * @return all standings to someone else
	 */
	ApiListResult<? extends StandingTo> getStandingsTo();

	/**
	 * @return all standings from someone else
	 */
	ApiListResult<? extends StandingFrom> getStandingsFrom();


	interface Standing extends ApiResult {

		/**
		 * @return what type of standing
		 */
		String getType();

		/**
		 * @return standing * 10
		 */
		int getStanding();

	}

	interface StandingTo extends Standing {

		/**
		 * @return ID
		 */
		long getToId();

		/**
		 * @return na,e
		 */
		String getToName();

	}

	interface StandingFrom extends Standing {

		/**
		 * @return ID
		 */
		long getFromId();

		/**
		 * @return name
		 */
		String getFromName();

	}
}
