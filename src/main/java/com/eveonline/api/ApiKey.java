/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api;

import java.io.Serializable;

/**
 * Represents the official authentication token.
 * 
 * @author Tobias Sarnowski
 */
public interface ApiKey extends Serializable {

	/**
	 * @return the user ID
	 */
	int getUserId();

	/**
	 * @return the api key
	 */
	String getKey();

}
