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
public interface IndustryJobs<J extends IndustryJobs.Job> extends ApiListResult<J> {

	interface Job extends ApiResult {

		/**
		 * @return the Job's ID
		 */
		long getId();

		/**
		 * @return the assembly line used
		 */
		long getAssemblyLineId();

		/**
		 * @return the container's ID
		 */
		long getContainerId();

		/**
		 * @return ID of the used item
		 */
		long getInstalledItemId();

		/**
		 * @return the location's ID
		 */
		long getInstalledItemLocationId();

		/**
		 * @return the quantity of installed items
		 */
		long getInstalltedItemQuantity();

		/**
		 * @return the items productivity level
		 */
		int getInstalledItemProductivityLevel();

		/**
		 * @return the item's material level
		 */
		int getInstalledItemMaterialLevel();

		/**
		 * @return runs remaining
		 */
		int getInstalledItemLicensedProductionRunsRemaining();

		/**
		 * @return where the results comes in
		 */
		long getOutputLocationId();

		/**
		 * @return who installed the jobs
		 */
		long getInstallerId();

		/**
		 * @return how many runs will be made
		 */
		int getRuns();

		/**
		 * @return how many runs
		 */
		int getLicensedProductionRuns();

		/**
		 * @return solar system's ID
		 */
		long getInstalledInSolarSystemId();

		/**
		 * @return the container's ID
		 */
		long getContainerLocationId();

		/**
		 * @return material multiplier
		 */
		int getMaterialMultiplier();

		/**
		 * @return material multiplier by character
		 */
		int getCharMaterialMultiplier();

		/**
		 * @return time multiplier
		 */
		double getTimeMultiplier();

		/**
		 * @return time multiplier by char
		 */
		double getCharTimeMultiplier();

		/**
		 * @return the installed item's typeID
		 */
		long getInstalledItemTypeId();

		/**
		 * @return the output item's typeID
		 */
		long getOutputTypeId();

		/**
		 * @return the container's typeID
		 */
		long getContainerTypeId();

		/**
		 * @return count of copies
		 */
		int getInstalledItemCopy();

		/**
		 * @return count of jobs completed
		 */
		int getCompleted();

		/**
		 * @return count of successfully completed jobs
		 */
		int getCompletedSuccessfully();

		/**
		 * @return invFlag of installed item
		 */
		int getInstalledItemFlag();

		/**
		 * @return invFlag of output item
		 */
		int getOutputFlag();

		/**
		 * @return job's activity
		 */
		int getActivityId();

		/**
		 * @return status of completion
		 */
		int getCompletedStatus();

		/**
		 * @return when the job was installed
		 */
		Date getInstallTime();

		/**
		 * @return when the production starts
		 */
		Date getBeginProductionTime();

		/**
		 * @return when the production finishes
		 */
		Date getEndProductionTime();

		/**
		 * @return when the production pauses
		 */
		Date getPauseProductionTime();

	}

}
