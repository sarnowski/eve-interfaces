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
public interface ContactNotification extends ApiResult {

	int getNotificationId();

	int getSenderId();

	String getSenderName();

	Date getSentDate();

	String getMessageData();

}
