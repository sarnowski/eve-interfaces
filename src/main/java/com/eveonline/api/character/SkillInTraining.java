/**
 * Copyright 2010 Tobias Sarnowski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiResult;
import com.eveonline.constants.SkillLevel;

import java.util.Date;

/**
 * @author Tobias Sarnowski
 */
public interface SkillInTraining extends ApiResult {

	/**
	 * @return if a skill is in training
	 */
	boolean isSkillInTraining();

	/**
	 * @return when the skill will be trained
	 */
	Date getTrainingEndTime();

	/**
	 * @return when the skill started to train
	 */
	Date getTrainingStartTime();

	/**
	 * @return the skill's typeID
	 */
	int getTrainingTypeId();

	/**
	 * @return how many skillpoints the skill had
	 */
	long getTrainingStartSkillPoints();

	/**
	 * @return to which level the skill will be trained
	 */
	SkillLevel getTrainingToLevel();

}
