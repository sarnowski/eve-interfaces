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
import com.eveonline.constants.SkillAttribute;
import com.eveonline.constants.SkillLevel;

/**
 * @author Tobias Sarnowski
 */
public interface SkillTree<G extends SkillTree.Group> extends ApiListResult<G> {

	interface Group extends ApiResult {

		/**
		 * @return the group's ID
		 */
		long getId();

		/**
		 * @return the group's name
		 */
		String getName();

		/**
		 * @return a list of all skills in this group
		 */
		ApiListResult<? extends Skill> getSkills();

	}


	interface Skill extends ApiResult {

		/**
		 * @return the skill's typeID
		 */
		long getTypeId();

		/**
		 * @return the skill's name
		 */
		String getName();

		/**
		 * @return the skill's group ID
		 */
		long getGroupId();

		/**
		 * @return the skill's description
		 */
		String getDescription();

		/**
		 * @return the skill's rank
		 */
		int getRank();

		/**
		 * @return required skills to learn this skill
		 */
		ApiListResult<? extends RequiredSkill> getRequiredSkills();

		/**
		 * @return the primary attribute
		 */
		SkillAttribute getPrimaryAttribute();

		/**
		 * @return the secondary attribute
		 */
		SkillAttribute getSecondaryAttribute();

		/**
		 * @return the list of bonuses
		 */
		ApiListResult<? extends SkillBonus> getSkillBonusCollection();


	}

	interface SkillBonus extends ApiResult {

		/**
		 * @return the bonus' type
		 */
		String getType();

		/**
		 * @return the bonus' value
		 */
		String getValue();

	}

	interface RequiredSkill extends ApiResult {

		/**
		 * @return the skill's typeID
		 */
		long getTypeId();

		/**
		 * @return the skill's level 
		 */
		SkillLevel getLevel();

	}

}
