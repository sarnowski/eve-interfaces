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
public interface IndustryJob extends ApiResult {

    /**
     * @return Unique id of the IndustryJob.
     */
    long getJobId();

    /**
     * A AssemblyLineId is unique and won't change for station assembly lines.
     * On mobile assembly lines the id changes by repackage and reinstall the assembly line.
     * @return Id of the assembly line the job is installed to.
     */
    long getAssemblyLineId();

    /**
     * @return if the container is a station the station id. if it's a pos module the item id.
     * @see {@link IndustryJob#getContainerTypeId()} to determine if the container is a station.
     */
    long getContainerId();

    /**
     * @return Blueprint itemID.
     */
    long getInstalledItemId();

    /**
     * @return location id from witch the blueprint was installed.
     */
    long getInstalledItemLocationID();

    /**
     * @return number of entered blueprints.
     */
    long getInstalledItemQuantity();

    /**
     * @return Starting PL of blueprint.
     */
    int getInstalledItemProductivityLevel();

    /**
     * @return starting ML of blueprint.
     */
    int getInstalledItemMaterialLevel();

    /**
     * @return Starting number of remaining runs of the Blueprint. -1 if it's a BPO.
     */
    int getInstalledItemLicensedProductionRunsRemaining();

    /**
     * @return Destination hangar for product.
     */
    long getOutputLocationId();

    /**
     * @return character id from the installer.
     */
    long getInstallerID();

    /**
     * @return Number of runs for this job.
     */
    int getRuns();

    /**
     * @return Number of runs on output BPC's for copying and inventing.
     */
    int getLicensedProductionRuns();

    /**
     * @return ID for the solar system the job is installed. See mapSolarSystems Table.
     */
    long getInstalledInSolarSystemId();

    /**
     * @return solar system id.
     */
    long getContainerLocationId();

    /**
     * Modifier for amount of materials required over standard BPO/C listing,
     * as effected by installation location
     *
     * i.e. Rapid Assembly Arrays have a modifier of 1.2, resulting in 20% extra material usage
     * @return Material multiplier.
     */
    float getMaterialMultiplier();

    /**
     * @return Effect character's skills and implants have.
     */
    float getCharMaterialMultiplier();

    /**
     * @return Effect of installation.
     */
    float getTimeMultiplier();

    /**
     * @return working speed as reduced by character skills.
     */
    float getCharTimeMultiplier();

    /**
     * @return Typeid of the blueprint.
     */
    long getInstalledItemTypeId();

    /**
     * @return products typeId.
     */
    long getOutputTypeId();

    /**
     * @return Container id. see invTypes.
     */
    long getContainerTypeId();

    /**
     * @return true if it is a BPC false on BPO
     */
    boolean isInstalledItemCopy();

    /**
     * @return true if the job is delivered.
     */
    boolean isCompleted();

    /**
     * @return
     */
    boolean isCompletedSuccessfully();

    /**
     * @return inventory flag of installed item. see http://wiki.eve-id.net/APIv2_Inventory_Flags
     */
    int getInstalledItemFlag();

    /**
     * @return Output inventory flag. see http://wiki.eve-id.net/APIv2_Inventory_Flags
     */
    int getOutputFlag();

    /**
     * @return Activity id of the job. see http://wiki.eve-id.net/TL2MaterialsActivity
     */
    long getActivityId();

    /**
     * @return Completion status - only matters if {@link IndustryJob#isCompleted()} returns true
     */
    CompletionStatus getCompletedStatus();

    /**
     * @return When the job was installed.
     */
    Date getInstallTime();

    /**
     * @return When the job was started.
     */
    Date getBeginProductionTime();

    /**
     * @return when the production end.
     */
    Date getEndProductionTime();

    /**
     * @return Normally "0001-01-01 00:00:00".
     *         If the job was installed into a POS module and that module went offline,
     *         this is when that module went offline.
     *         The S&I window in-game calculates the difference between this and
     *         endProductionTime to show time remaining (in red, and not counting down).
     *         When the module is back up, this is reset to "0001-01-01 00:00:00"
     *         and the endProductionTime is updated to reflect the delay.
     */
    Date getPauseProductionTime();

    enum CompletionStatus {
        DELIVERED,
        ABORTED,
        GM_ABORTED,
        INFLIGHT_UNANCHORED,
        DESTROYED,
        FAILED
    }
}