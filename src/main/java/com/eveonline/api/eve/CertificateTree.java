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

        int getCategoryId();

        String getCategoryName();

        ApiListResult<Classes> getClasses();
        
    }


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
