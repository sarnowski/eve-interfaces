/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api;

import java.util.List;

/**
 * A list of ApiResults.
 * 
 * @author Tobias Sarnowski
 */
public interface ApiListResult<T extends ApiResult> extends ApiResult, List<T> {

}
