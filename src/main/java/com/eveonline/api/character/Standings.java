/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface Standings extends ApiResult {

	ApiListResult<StandingTo> getStandingsTo();

	ApiListResult<StandingFrom> getStandingsFrom();


	interface Standing extends ApiResult {

		String getType();

		int getStanding();

	}

	interface StandingTo extends Standing {

		int getToId();

		String getToName();

	}

	interface StandingFrom extends Standing {

		int getFromId();

		String getFromName();

	}
}
