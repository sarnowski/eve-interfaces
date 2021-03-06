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

package com.eveonline.api.corp;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

import java.util.Date;

/**
 * @author Tobias Sarnowski
 * @author Dominik Eckelmann
 */
public interface MemberMedals<M extends MemberMedals.Medal> extends ApiListResult<M> {

    interface Medal extends ApiResult {

        /**
         * @return the medal's ID
         */
        long getId();

        /**
         * @return the character's ID
         */
        long getCharacterId();

        /**
         * @return the reson for issuing this medal
         */
        String getReason();

        /**
         * @return the medal's status
         */
        String getStatus();

        /**
         * @return the issuer's ID
         */
        long getIssuerId();

        /**
         * @return when the medal was issued
         */
        Date getIssued();
    }
}
