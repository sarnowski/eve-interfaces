/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
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
