/**
 * Copyright 2010 Tobias Sarnowski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
