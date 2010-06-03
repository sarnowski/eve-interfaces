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
public interface Research extends ApiResult {

	int getAgentId();

	int getSkillTypeId();

	Date getResearchStartDate();

	double getPointsPerDay();

	double getRemainderPoints();

}
