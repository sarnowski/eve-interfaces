/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface Contact extends ApiResult {

	int getContactId();

	String getContactName();

	boolean isInWatchlist();

	int getStanding();

}
