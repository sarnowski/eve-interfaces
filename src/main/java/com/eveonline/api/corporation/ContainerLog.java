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

public interface ContainerLog extends ApiResult{
    Date getLogTime();

    int getItemId();

    int getItemTypeId();

    /**
     * @return ID of the character that made the change.
     */
    int getActorId();

    /**
     * @return Name of the character that made the change. 
     */
    String getActorName();

    int getFlag(); // FIXME: flag?

    int getLocationId();

    String getAction();

    String getPasswordType(); // FIXME

    /**
     * @return ID of item type in log?
     */
    int getTypeId();

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
