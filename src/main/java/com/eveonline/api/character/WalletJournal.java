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
public interface WalletJournal extends ApiResult {

	Date getDate();

	int getRefId();

	int getRefTypeId();

	String getFirstOwnerName();

	int getFirstOwnerId();

	String getSecondOwnerName();

	int getSecondOwnerId();

	String getFirstArgumentName();

	int getFirstArgumentId();

	float getAmount();

	float getBalance();

	String getReason();

	int getTaxReceiverId();

	float getTaxAmount();

}
