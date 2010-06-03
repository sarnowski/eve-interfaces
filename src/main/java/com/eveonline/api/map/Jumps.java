/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.map;

import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface Jumps extends ApiResult {

	int getSolarSystemId();

	int getShipJumps();

}
