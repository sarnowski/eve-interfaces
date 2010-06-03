/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiResult;

import java.util.Date;
import java.util.List;

/**
 * @author Tobias Sarnowski
 */
public interface MailMessage extends ApiResult {

	int getMessageId();

	int getSenderId();

	Date getSentDate();

	String getTitle();

	int toCorporationOrAllianceId();

	List<Integer> toCharacterIds();

	List<Integer> toListIds();

	boolean isRead();

}
