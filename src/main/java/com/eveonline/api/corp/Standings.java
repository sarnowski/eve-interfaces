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

public interface Standings extends ApiResult {

    CorporationStandings getCorporationStandings();

    AllianceStandings getAllianceStandings();

    interface CorporationStandings extends ApiResult{
        StandingsTo getStandingsTo();

        StandingsFrom getStandingsFrom();
    }

    interface StandingsTo extends ApiResult{
        ApiListResult<CharacterStandingTo> getCharacterStandingTo();

        ApiListResult<CorporationStandingTo> getCorporationStandingTo();

        ApiListResult<AlliancesStandingTo> getAlliancesStandingTo();
    }

    interface StandingsFrom extends ApiResult{
        ApiListResult<AgentStandingsFrom> getAgentStandings();

        ApiListResult<NPCCorporationStandingFrom> getCorporationStandingFrom();

        ApiListResult<FactionStandingFrom> getAlliancesStandingFrom();
    }

    interface AllianceStandings extends ApiResult{
        AllianceStandingsTo getAllianceStandingsTo();
    }

    interface AlliancesStandingTo extends ApiResult{

        int getAllianceId();

        String getAllianceName();

        float getStanding();
    }

    interface AllianceStandingsTo extends ApiResult{
        ApiListResult<AllianceStandingToCorporation> getCorporations();

        ApiListResult<AllianceStandingToAlliance> getAlliances();
    }

    interface AgentStandingsFrom extends ApiResult{
        int getAgendId();

        String getAgendName();

        float getStanding();
    }

    interface AllianceStandingToAlliance extends ApiResult{
        int getAllianceId();

        String getAllianceName();

        float getStanding();
    }

    interface AllianceStandingToCorporation extends ApiResult{
        int getCorporationId();

        String getCorporationName();

        float getStanding();
    }

    interface CharacterStandingTo extends ApiResult {

        int getCharacterId();

        String getCharacterName();

        float getStanding();
    }

    interface CorporationStandingTo extends ApiResult{

        int getCorporationId();

        String getCorporationName();

        float getStanding();
    }

    interface FactionStandingFrom extends ApiResult{
        int getFactionId();

        String getFactionName();

        float getStanding();
    }

    interface NPCCorporationStandingFrom extends ApiResult{
        int getCorporationId();

        String getCorporationName();

        float getStanding();
    }
}
