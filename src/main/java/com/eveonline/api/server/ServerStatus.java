/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.server;

import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface ServerStatus extends ApiResult {

	/**
	 * @return if the server allows logins for players
	 */
	boolean isServerOpen();

	/**
	 * @return number of logged in players
	 */
	long getOnlinePlayers();

}
