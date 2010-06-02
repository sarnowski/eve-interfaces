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
public interface FacWarStats extends ApiResult {

	int getFactionId();

	String getFactionName();

	Date getEnlisted();

	int getHighestRank();

	int getKillsYesterday();

	int getKillsLastDay();

	int getKillsTotal();

	int getVictoryPointsYesterday();

	int getVictoryPointsLastWeek();

	int getVictoryPointsTotal();

}
