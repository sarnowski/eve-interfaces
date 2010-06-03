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
public interface Sovereignty extends ApiResult {

	Date getDataTime();

	ApiListResult<SolarSystem> getSolarSystems();


	interface SolarSystem extends ApiResult {

		int getSolarSystemId();

		int getAllianceId();

		int getFactionId();

		String getSolarSystemName();

		int getCorporationId();

	}

}
