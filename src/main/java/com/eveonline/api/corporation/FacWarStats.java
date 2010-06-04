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
public interface FacWarStats extends ApiResult{

    /**
     * @return ID of the faction the corporation is enlisted to.
     */
    int getFactionId();

    /**
     * @return Name of the faction the corporation is enlisted to.
     */
    String getFactionName();

    /**
     * @return Enlisted to faction warfare since.
     */
    Date getEnlisted();

    /**
     * @return pilots enlisted.
     */
    int getPilots();

    /**
     * @return number of kills yesterday.
     */
    int getKillsYesterday();

    /**
     * @return number of kills last week.
     */
    int getKillsLastWeek();

    /**
     * @return number of kills overall.
     */
    int getKillsTotal();

    /**
     * @return victory points yesterday.
     */
    int getVictoryPointsYesterday();

    /**
     * @return victory points from last week.
     */
    int getVictoryPointsLastWeek();

    /**
     * @return total victory points.
     */
    int getVictoryPointsTotal();
}
