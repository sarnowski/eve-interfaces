/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface MailingList extends ApiResult {

	int getListId();

	String getDisplayName();

}