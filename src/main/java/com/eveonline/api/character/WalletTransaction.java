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
public interface WalletTransaction extends ApiResult {

	Date getTramsactopmDate();

	int getTransactionId();

	int getQuantity();

	String getTypeName();

	int getTypeId();

	int getPrice();

	int getClientId();

	int getClientName();

	int getStationId();

	String getStationName();

	String getTransactionType();

	String getTransactionFor();

}
