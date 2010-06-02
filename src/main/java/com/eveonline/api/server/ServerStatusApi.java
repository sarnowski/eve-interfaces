/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.server;

import com.eveonline.api.exceptions.ApiException;

/**
 * @author Tobias Sarnowski
 */
public interface ServerStatusApi {

	ServerStatus getServerStatus() throws ApiException;

}
