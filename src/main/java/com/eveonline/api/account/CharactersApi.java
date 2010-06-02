/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.account;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.LimitedApiKey;
import com.eveonline.api.exceptions.ApiException;

/**
 * @author Tobias Sarnowski
 */
public interface CharactersApi {

	/**
	 * @param key limited api key
	 * @return the list of all characters of the key's account
	 * @throws ApiException
	 */
	ApiListResult<Character> getCharacters(LimitedApiKey key) throws ApiException;

}
