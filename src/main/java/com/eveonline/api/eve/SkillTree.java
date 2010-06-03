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
package com.eveonline.api.eve;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface SkillTree extends ApiResult {

	String getGroupName();

	String getGroupId();

	ApiListResult<Skill> getSkills();


	interface Skill extends ApiResult {

		int getTypeId();

		String getTypeName();

		int getGroupId();

		String getDescription();

		int getRank();

		ApiListResult<RequiredSkill> getRequiredSkills();

		String getPrimaryAttribute();

		String getSecondaryAttribute();

		ApiListResult<SkillBonus> getSkillBonusCollection();


		interface RequiredSkill extends ApiResult {

			int getTypeId();

			int getSkillLevel();

		}

		interface SkillBonus extends ApiResult {

			String getBonusType();

			String getBonusValue();

		}
	}

}
