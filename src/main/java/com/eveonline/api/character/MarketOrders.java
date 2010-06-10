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

import java.util.Date;

/**
 * @author Tobias Sarnowski
 */
public interface MarketOrders<M extends MarketOrders.MarketOrder> extends ApiListResult<M> {

	interface MarketOrder extends ApiResult {

		/**
		 * @return the market order's ID
		 */
		long getId();

		/**
		 * @return the character's ID
		 */
		long getCharacterId();

		/**
		 * @return the station's ID
		 */
		long getStationId();

		/**
		 * @return count of items
		 */
		long getVolumeEntered();

		/**
		 * @return count of items remaining
		 */
		long getVolumeRemaining();

		/**
		 * @return minimum volume
		 */
		long getMinVolume();

		/**
		 * @return the order's state
		 */
		int getOrderState();

		/**
		 * @return the item's typeID
		 */
		long getTypeId();

		/**
		 * @return the range in X
		 */
		long getRange();

		/**
		 * @return the account key
		 */
		long getAccountKey();

		/**
		 * @return get duration in X
		 */
		long getDuration();

		/**
		 * @return the escrow
		 */
		float getEscrow();

		/**
		 * @return the ISK*100
		 */
		long getPrice();

		/**
		 * @return the big
		 */
		long getBid();

		/**
		 * @return when the order was started
		 */
		Date getIssued();

	}

}
