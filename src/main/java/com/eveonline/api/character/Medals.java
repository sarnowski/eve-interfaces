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
public interface Medals extends ApiResult {

	ApiListResult<CurrentCorporationMedal> getCurrentCorporationMedals();

	ApiListResult<OtherCorporationMedal> getOtherCorporationMedals();


	interface CurrentCorporationMedal extends ApiResult {

		int getMedalId();

		String getReason();

		String getStatus();

		int getIssuerId();

		Date getIssued();

	}

	interface OtherCorporationMedal extends CurrentCorporationMedal {

		int getCorporationId();

		String getTitle();

		String getDescription();

	}
}
