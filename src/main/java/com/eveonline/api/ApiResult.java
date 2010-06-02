/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api;

import java.net.URI;
import java.util.Date;
import java.util.Map;

/**
 * A single result object of an api response.
 *
 * @author Tobias Sarnowski
 */
public interface ApiResult {

	/**
	 * @return the time of this response creation
	 */
	Date getDateCreated();

	/**
	 * @return the time until this response will be cached by the server
	 */
	Date getCachedUntil();


	/**
	 * @return the requested xml path
	 */
	String getRequestedXmlPath();

	/**
	 * @return the used api key
	 */
	ApiKey getUsedApiKey();

	/**
	 * @return the used parameters
	 */
	Map<String,String> getUsedParameters();

	/**
	 * @return the used server URI
	 */
	URI getUsedServerUri();

}
