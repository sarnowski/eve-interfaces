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
public interface CertificateTree extends ApiListResult<CertificateTree.Category> {

    interface Category extends ApiResult {

	    /**
	     * @return the category's ID
	     */
        long getId();

	    /**
	     * @return the category's name
	     */
        String getName();

	    /**
	     * @return classes of certificates in this category
	     */
        ApiListResult<Classes> getClasses();
        
    }


    interface Classes extends ApiResult {

	    /**
	     * @return the class's ID
	     */
        long getId();

	    /**
	     * @return the class's name
	     */
        String getName();

	    /**
	     * @return all certificate's beloning to this class
	     */
        ApiListResult<Certificate> getCertificates();

    }

    interface Certificate extends ApiResult {

	    /**
	     * @return the certificate's ID
	     */
        long getId();

	    /**
	     * @return the certificate's grade
	     */
        int getGrade();

	    /**
	     * @return the corporation's ID
	     */
        long getCorporationId();

	    /**
	     * @return the certificate's description
	     */
        String getDescription();

	    /**
	     * @return the list of required skills to fulfill the certificate
	     */
        ApiListResult<RequiredSkill> getRequiredSkills();

	    /**
	     * @return the list of required certificates to fulfill the certitifate
	     */
        ApiListResult<RequiredCertificate> getRequiredCertificates();

    }

    interface RequiredSkill extends ApiResult {

	    /**
	     * @return the typeID of the skill
	     */
        long getTypeId();

	    /**
	     * @return the required level
	     */
        int getLevel();

    }

    interface RequiredCertificate extends ApiResult {

	    /**
	     * @return the certificate's ID
	     */
        long getId();

	    /**
	     * @return the required grade
	     */
        int getGrade();

    }

}
