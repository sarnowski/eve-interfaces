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

/**
 * @author Dominik Eckelmann
 * @author Tobias Sarnowski
 */
public interface AssetList<A extends AssetList.Asset> extends ApiListResult<A> {

    interface Asset extends ApiResult {

        /**
         * @return ID of the Item.
         */
        long getId();

        /**
         * @return type ID of the item. References to invTypes database table.
         */
        long getTypeId();

        /**
         * @return Number of items in the stack.
         */
        long getQuantity();

        /*
        * @return Storage location.
        * @see http://wiki.eve-id.net/API_Inventory_Flags
        */
        int getFlag();

        /**
         * @return true when the item is packed.
         */
        boolean isSingleton();

        /**
         * @return References to a solar system or a station or zero if no location ID is provided
         */
        long getLocationId();

        /**
         * @return the Assets contained in the container.
         */
        ApiListResult<? extends Asset> getContainingAssets();

    }
}
