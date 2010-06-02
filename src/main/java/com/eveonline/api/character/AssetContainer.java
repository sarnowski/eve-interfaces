/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiListResult;

/**
 * @author Tobias Sarnowski
 */
public interface AssetContainer extends Asset {

	int getLocationId();

	ApiListResult<Asset> getContainingAssets();

}