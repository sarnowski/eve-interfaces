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
 * @author Dominik Eckelmann
 * @author Tobias Sarnowski
 */
public interface MarketOrders<O extends MarketOrders.Order> extends ApiListResult<O> {

    interface Order extends ApiResult {

        /**
         * @return Market order ID.
         */
        long getId();

        /**
         * @return ID of the character that placed the order.
         */
        long getCharacterId();

        /**
         * @return ID of the station the oder is placed.
         */
        long getStationId();

        /**
         * @return Quantity of inserted items at the beginning.
         */
        long getVolEntered();

        /**
         * @return Number of remaining items.
         */
        long getVolRemaining();

        /**
         * @return Minimum number of items to buy/sell in a single transaction.
         */
        long getMinVolume();

        /**
         * @return State of the order.
         */
        State getOrderState();

        /**
         * @return TypeID of the item to transact.
         */
        long getTypeId();

        /**
         * Maximum order range.
         *
         * On sell orders its always 32767.
         * On buy orders it indicates the maximum jumps to buy something.
         *  <li>-1 is station wide  </li>
         *  <li>0  is system wide   </li>
         *  <li>32767 is region wide</li>
         * @return Maximum order range.
         */
        int getRange();

        /**
         * @return Wallet division the order is using.
         */
        int getAccountKey();

        /**
         * @return Remaining days for the order.
         */
        int getDuration();

        /**
         * @return How much ISK is in escrow. (for buy orders only?)
         */
        long getEscrow();

        /**
         * @return Unit ISK price for the order *100.
         */
        long getPrice();

        /**
         * @return true if the order is a buy order.
         */
        boolean getBid();

        /**
         * @return When the order was issued.
         */
        Date getIssued();

    }

    /**
     * Describes a state of a order.
     */
    enum State {
        OPEN,
        CLOSED,
        EXPIRED,
        CANCELLED,
        PENDING,
        CHARACTER_DELETED
    }
}
