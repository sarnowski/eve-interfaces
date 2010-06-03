/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiService;
import com.eveonline.api.FullApiKey;

/**
 * @author Tobias Sarnowski
 */
public interface MedalsApi extends ApiService {

	Medals getMedals(FullApiKey key, int characterId);

}
