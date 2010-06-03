/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.eve;

import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface CharacterName extends ApiResult {

	String getName();

	int getCharacterId();

}
