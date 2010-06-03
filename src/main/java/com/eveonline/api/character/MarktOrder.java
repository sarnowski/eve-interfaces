/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiResult;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Tobias Sarnowski
 */
public interface MarktOrder extends ApiResult {

	int getOrderId();

	int getCharacterId();

	int getStationId();

	int getVolumeEntered();

	int getVolumeRemaining();

	int getMinVolume();

	int getOrderState();

	int getTypeId();

	int getRange();

	int getAccountKey();

	int getDuration();

	float getEscrow();

	BigDecimal getPrice();

	int getBid();

	Date getIssued();

}
