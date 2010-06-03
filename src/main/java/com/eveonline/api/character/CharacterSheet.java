/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

import java.math.BigDecimal;

/**
 * @author Tobias Sarnowski
 */
public interface CharacterSheet {

	int getCharacterId();

	String getName();

	String getRace();

	String getBloodLine();

	String getGender();

	String getCorporationName();

	int getCorporationId();

	String getCloneName();

	int getCloneSkillPoints();

	ApiListResult<Skills> getSkills();

	BigDecimal getBalance();

	ApiListResult<AttributeEnhancer> getAttributeEnhancers();

	ApiListResult<CorporationRole> getCorporationRoles();

	ApiListResult<CorporationRole> getCorporationRolesAtHQ();

	ApiListResult<CorporationRole> getCorporationRolesAtOther();


	/**
	 * @author Tobias Sarnowski
	 */
	interface Attribute extends ApiResult {

		String getAttributeName();

		int getAttributeValue();

	}

	/**
	 * @author Tobias Sarnowski
	 */
	interface AttributeEnhancer extends ApiResult {

		String getAugementorAttribute();

		String getAugementorName();

		int getAugementorValue();

	}

	/**
	 * @author Tobias Sarnowski
	 */
	interface Certificate extends ApiResult {

		int getCertificateId();

	}

	/**
	 * @author Tobias Sarnowski
	 */
	interface CorporationRole extends ApiResult {

		int getRoleId();

		String getRoleName();

	}

	/**
	 * @author Tobias Sarnowski
	 */
	interface CorporationTitle extends ApiResult {

		int getTitleId();

		String getTitleName();

	}

	/**
	 * @author Tobias Sarnowski
	 */
	interface Skills extends ApiResult {

		int getTypeId();

		int getSkillPoints();

		int getLevel();

		boolean isUnpublished();

	}
}
