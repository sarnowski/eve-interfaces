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
public interface SkillQueue extends ApiResult {

	int getQueuePosition();

	int getTypeId();

	int getLevel();

	int getStartSkillPoints();

	int getEndSkillPoints();

	Date getStartTime();

	Date getEndTime();

}
