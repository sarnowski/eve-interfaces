/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.eve;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiResult;

import java.util.Date;

/**
 * @author Tobias Sarnowski
 */
public interface Alliance extends ApiResult {

	String getName();

	String getShortName();

	int getAllianceId();

	int getExecutorCorpId();

	int getMemberCount();

	Date getStartDate();

	ApiListResult<Corporation> getCorporations();


	interface Corporation extends ApiResult {

		int getCorporationId();

		Date getStartDate();

	}

}
