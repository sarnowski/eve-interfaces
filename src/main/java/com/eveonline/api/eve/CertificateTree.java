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
public interface CertificateTree extends ApiResult {

	int getCategoryId();

	String getCategoryName();

	ApiListResult<Classes> getClasses();


	interface Classes extends ApiResult {

		int getClassId();

		String getClassName();

		ApiListResult<Certificate> getCertificates();

	}

	interface Certificate extends ApiResult {

		int getCertificateId();

		int getGrade();

		int getCorporationId();

		String getDescription();

		ApiListResult<RequiredSkill> getRequiredSkills();

		ApiListResult<RequiredCertificate> getRequiredCertificates();

	}

	interface RequiredSkill extends ApiResult {

		int getTypeId();

		int getLevel();

	}

	interface RequiredCertificate extends ApiResult {

		int getCertificateId();

		int getGrade();

	}

}
