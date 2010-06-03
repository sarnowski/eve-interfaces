/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.account;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface Characters extends ApiListResult<Characters.Character> {

	interface Character extends ApiResult {

		/**
		 * @return the character's official ID
		 */
		long getId();

		/**
		 * @return the character's name
		 */
		String getName();

		/**
		 * @return the character's official corporation ID
		 */
		long getCorporationId();

		/**
		 * @return the character's corporation name
		 */
		String getCorporationName();

	}

}
