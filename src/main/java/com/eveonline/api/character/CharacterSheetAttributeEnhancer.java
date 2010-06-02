/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface CharacterSheetAttributeEnhancer extends ApiResult {

	String getAugementorAttribute();

	String getAugementorName();

	int getAugementorValue();

}
