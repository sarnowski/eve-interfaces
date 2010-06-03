/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiResult;

import java.util.Date;

/**
 * @author Tobias Sarnowski
 */
public interface Notification extends ApiResult {

	int getNotificationId();

	int getTypeId();

	int getSenderId();

	Date getSentDate();

	boolean isRead();

}
