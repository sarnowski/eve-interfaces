/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.eve;

import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface ConquerableStation extends ApiResult {

	int getStationId();

	String getStationName();

	int getStationTypeId();

	int getSolarSystemId();

	int getCorporationId();

	String getCorporationName();

}
