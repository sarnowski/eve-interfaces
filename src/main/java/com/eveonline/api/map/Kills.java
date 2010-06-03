/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.map;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

import java.util.Date;

/**
 * @author Tobias Sarnowski
 */
public interface Kills extends ApiResult {

	Date getDataTime();

	ApiListResult<Kill> getKills();


	interface Kill extends ApiResult {

		int getSolarSystemId();

		int getShipKills();

		int getFactionKills();

		int getPodKills();

	}

}
