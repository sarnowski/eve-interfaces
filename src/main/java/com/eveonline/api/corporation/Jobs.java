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

public interface Jobs extends ApiResult {

    int getJobId();

    int getAssemblyLineId();

    int getContainerId();

    /**
     * @return Blueprint itemID.
     */
    int getInstalledItemId();

    int getInstalledItemLocationID();

    int getInstalledItemQuantity();

    int getInstalledItemProductivityLevel();

    int getInstalledItemMaterialLevel();

    int getInstalledItemLicensedProductionRunsRemaining();

    int getOutputLocationId();

    int getInstallerID();

    int getRuns();

    int getLicensedProductionRuns();

    int getInstalledInSolarSystemId();

    int getContainerLocationId();

    float getMaterialMultiplier();

    float getCharMaterialMultiplier();

    float getTimeMultiplier();

    float getCharTimeMultiplier();

    int getInstalledItemTypeId();

    int getOutputTypeId();

    int getContainerTypeId();

    boolean isInstalledItemCopy();

    boolean isCompleted();

    boolean isCompletedSuccessfully();

    int getInstalledItemFlag();

    int getOutputFlag();

    int getActivityId();

    int getCompletedStatus();

    Date getInstallTime();

    Date getBeginProductionTime();

    Date getEndProductionTime();

    Date getPauseProductionTime();
}