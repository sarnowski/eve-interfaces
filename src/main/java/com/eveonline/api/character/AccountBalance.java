/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiResult;

import java.math.BigDecimal;

/**
 * @author Tobias Sarnowski
 */
public interface AccountBalance extends ApiResult {

	int getAccountId();

	int getAccountKey();

	BigDecimal getBalance();

}
