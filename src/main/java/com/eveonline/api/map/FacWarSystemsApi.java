/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.map;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiService;

/**
 * @author Tobias Sarnowski
 */
public interface FacWarSystemsApi extends ApiService {

	ApiListResult<FacWarSystem> getFactionWarfareSystems();

}
