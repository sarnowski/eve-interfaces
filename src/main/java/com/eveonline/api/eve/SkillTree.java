/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
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
