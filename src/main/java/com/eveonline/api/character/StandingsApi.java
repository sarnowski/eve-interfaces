/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiService;
import com.eveonline.api.LimitedApiKey;

/**
 * @author Tobias Sarnowski
 */
public interface StandingsApi extends ApiService {

	Standings getStandings(LimitedApiKey key, int characterId);

}
