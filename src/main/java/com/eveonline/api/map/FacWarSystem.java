/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.map;

import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface FacWarSystem extends ApiResult {

	int getSolarSystemId();

	String getSolarSystemName();

	int getOccupyingFactionId();

	String getOccupyingFactionName();

	boolean isContested();

}
