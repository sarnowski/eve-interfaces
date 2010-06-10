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
public interface Medals extends ApiResult {

	/**
	 * @return list of medals of the current corporation
	 */
	ApiListResult<? extends CurrentCorporationMedal> getCurrentCorporationMedals();

	/**
	 * @return list of medals, gained in other corporations
	 */
	ApiListResult<? extends OtherCorporationMedal> getOtherCorporationMedals();


	interface CurrentCorporationMedal extends ApiResult {

		/**
		 * @return the medal's ID
		 */
		long getId();

		/**
		 * @return the reason, why the medal was earned
		 */
		String getReason();

		/**
		 * @return the medal's status
		 */
		String getStatus();

		/**
		 * @return who gave the medal
		 */
		long getIssuerId();

		/**
		 * @return when was the medal given
		 */
		Date getIssued();

	}

	interface OtherCorporationMedal extends CurrentCorporationMedal {

		/**
		 * @return the corporation's ID
		 */
		int getCorporationId();

		/**
		 * @return the medal's title
		 */
		String getTitle();

		/**
		 * @return the medal's description
		 */
		String getDescription();

	}
}
