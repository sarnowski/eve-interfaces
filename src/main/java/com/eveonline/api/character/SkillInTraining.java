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
public interface SkillInTraining extends ApiResult {

	boolean isSkillInTraining();

	Date getTrainingEndTime();

	Date getTrainingStartTime();

	int getTrainingTypeId();

	int getTrainingStartSkillPoints();

	int getTrainingToLevel();

}
