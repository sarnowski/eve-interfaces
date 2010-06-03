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

import com.eveonline.api.ApiResult;

import java.util.Date;

/**
 * @author Tobias Sarnowski
 */
public interface IndustryJob extends ApiResult {

	int getJobId();

	int getAssemblyLineId();

	int getContainerId();

	int getInstalledItemId();

	int getInstalledItemLocationId();

	int getInstalltedItemQuantity();

	int getInstalledItemProductivityLevel();

	int getInstalledItemMaterialLevel();

	int getInstalledItemLicensedProductionRunsRemaining();

	int getOutputLocationId();

	int getInstallerId();

	int getRuns();

	int getLIcensedProductionRuns();

	int getInstalledInSolarSystemId();

	int getContainerLocationId();

	int getMaterialMultiplier();

	int getCharMaterialMultiplier();

	double getTimeMultiplier();

	double getCharTimeMultiplier();

	int getInstalledItemTypeId();

	int getOutputTypeId();

	int getContainerTypeId();

	int getInstalledItemCopy();

	int getCompleted();

	int getCompletedSuccessfully();

	int getInstalledItemFlag();

	int getOutputFlag();

	int getActivityId();

	int getCompletedStatus();

	Date getInstallTime();
	
	Date getBeginProductionTime();

	Date getEndProductionTime();

	Date getPauseProductionTime();

}
