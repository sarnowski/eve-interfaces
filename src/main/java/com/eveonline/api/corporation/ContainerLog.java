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

package com.eveonline.api.corporation;

import com.eveonline.api.ApiResult;

import java.util.Date;

/**
 * @author Dominik Eckelmann
 */
public interface ContainerLog extends ApiResult{

    /**
     * @return Time of the logentry.
     */
    Date getLogTime();

    /**
     * @return Item the entry belongs to.
     */
    int getItemId();

    /**
     * @return Item type ID.
     */
    int getItemTypeId();

    /**
     * @return ID of the character that made the change.
     */
    int getActorId();

    /**
     * @return Name of the character that made the change. 
     */
    String getActorName();

    /*
     * @return Storage location.
     * @see http://wiki.eve-id.net/API_Inventory_Flags
     */
    int getFlag();

    /**
     * @return Location ID of the container the log belongs to.
     */
    int getLocationId();

    /**
     * @return What happened to the container.
     */
    String getAction();

    /**
     * @return Which password type was changed. Config or Container.
     */
    String getPasswordType();

    /**
     * @return the container item type ID.
     */
    int getTypeId();

    /**
     * @return Quantity of modified items.
     */
    int getQuantity();

    /**
     * @return new Flag option?
     */
    int getOldConfiguration();

    /**
     * @return old Flag option?
     */
    int getNewConfiguration();
}
