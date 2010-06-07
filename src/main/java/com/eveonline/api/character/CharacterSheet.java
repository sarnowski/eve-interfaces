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

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;
import com.eveonline.constants.SkillAttribute;
import com.eveonline.constants.SkillLevel;

/**
 * @author Tobias Sarnowski
 */
public interface CharacterSheet extends ApiResult {

	/**
	 * @return the character's ID
	 */
	long getId();

	/**
	 * @return the character's name
	 */
	String getName();

	/**
	 * @return the character's race
	 */
	String getRace();

	/**
	 * @return the character's bloodline
	 */
	String getBloodLine();

	/**
	 * @return the character's gender
	 */
	String getGender();

	/**
	 * @return the character's corporation ID
	 */
	long getCorporationId();

	/**
	 * @return the character's corporation name
	 */
	String getCorporationName();

	/**
	 * @return the character's clone name
	 */
	String getCloneName();

	/**
	 * @return the count of skillpoints, storable by the character's clone
	 */
	long getCloneSkillPoints();

	/**
	 * @return list of the character's attribute values
	 */
	ApiListResult<? extends Attribute> getAttributes();

	/**
	 * @return the character's attribute enhancer implants
	 */
	ApiListResult<? extends AttributeEnhancer> getAttributeEnhancers();

	/**
	 * @return the character's skills
	 */
	ApiListResult<? extends Skill> getSkills();

	/**
	 * @return ISK * 100
	 */
	long getBalance();

	/**
	 * @return the character's certificates
	 */
	ApiListResult<? extends Certificate> getCertificates();

	/**
	 * @return the character's corporation roles
	 */
	ApiListResult<? extends CorporationRole> getCorporationRoles();

	/**
	 * @return the character's corporation roles at the HQ
	 */
	ApiListResult<? extends CorporationRole> getCorporationRolesAtHQ();

	/**
	 * @return the character's corporation roles at other players
	 */
	ApiListResult<? extends CorporationRole> getCorporationRolesAtOther();

	/**
	 * @return the character's list of titles
	 */
	ApiListResult<? extends CorporationTitle> getCorporationTitles();


	interface Attribute extends ApiResult {

		/**
		 * @return the attribute's type
		 */
		SkillAttribute getType();

		/**
		 * @return the attribute's value
		 */
		int getValue();

	}

	interface AttributeEnhancer extends ApiResult {

		/**
		 * @return the enhancer's name
		 */
		String getName();

		/**
		 * @return the enhanced attribute
		 */
		SkillAttribute getAttribute();

		/**
		 * @return the value of enhancement
		 */
		int getValue();

	}

	interface Certificate extends ApiResult {

		/**
		 * @return the certificate's ID
		 */
		long getId();

	}

	interface CorporationRole extends ApiResult {

		/**
		 * @return the role's ID
		 */
		long getId();

		/**
		 * @return the role's name
		 */
		String getName();

	}

	interface CorporationTitle extends ApiResult {

		/**
		 * @return the title's ID
		 */
		int getId();

		/**
		 * @return the title's name
		 */
		String getName();

	}

	interface Skill extends ApiResult {

		/**
		 * @return the skill's typeID
		 */
		int getTypeId();

		/**
		 * @return how many skillpoints already gained
		 */
		int getSkillPoints();

		/**
		 * @return the skill's level
		 */
		SkillLevel getLevel();

		/**
		 * @return is an unpublished skill
		 */
		boolean isUnpublished();

	}
}
