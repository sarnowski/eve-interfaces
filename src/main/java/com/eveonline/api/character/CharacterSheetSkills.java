/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiResult;

/**
 * @author Tobias Sarnowski
 */
public interface CharacterSheetSkills extends ApiResult {

	int getTypeId();

	int getSkillPoints();

	int getLevel();

	boolean isUnpublished();

}