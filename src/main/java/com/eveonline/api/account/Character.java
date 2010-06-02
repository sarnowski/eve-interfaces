/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.account;

import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface Character extends ApiResult {

	/**
	 * @return the character's official ID
	 */
	int getCharacterId();

	/**
	 * @return the character's name
	 */
	String getName();

	/**
	 * @return the character's official corporation ID
	 */
	int getCorporationId();

	/**
	 * @return the character's corporation name
	 */
	String getCorporationName();

}
