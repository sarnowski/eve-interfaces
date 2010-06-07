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

/**
 * @author Tobias Sarnowski
 */
public interface AssetList<A extends AssetList.Asset> extends ApiListResult<A> {

	interface Asset extends ApiResult {

		/**
		 * @return the asset's ID
		 */
		long getId();

		/**
		 * @return the asset's typeID
		 */
		long getTypeId();

		/**
		 * @return count of assets of this type
		 */
		long getQuantity();

		/**
		 * @return the asset's type (see database table 'invFlags')
		 */
		int getFlag();

		/**
		 * @return if this item is packaged
		 */
		boolean isSingleton();


		/**
		 * @return the asset's solarsystem or station if not within a container (else 0)
		 */
		long getLocationId();

		/**
		 * @return the list of assets, contained in this asset
		 */
		ApiListResult<? extends Asset> getContainingAssets();

	}
}
