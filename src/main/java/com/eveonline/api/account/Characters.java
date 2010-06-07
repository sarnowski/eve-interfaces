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
package com.eveonline.api.account;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface Characters<C extends Characters.Character> extends ApiListResult<C> {

	interface Character extends ApiResult {

		/**
		 * @return the character's official ID
		 */
		long getId();

		/**
		 * @return the character's name
		 */
		String getName();

		/**
		 * @return the character's official corporation ID
		 */
		long getCorporationId();

		/**
		 * @return the character's corporation name
		 */
		String getCorporationName();

	}

}
