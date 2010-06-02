/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.character;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Tobias Sarnowski
 */
public interface CharacterSheet {

	int getCharacterId();

	String getName();

	String getRace();

	String getBloodLine();

	String getGender();

	String getCorporationName();

	int getCorporationId();

	String getCloneName();

	int getCloneSkillPoints();

	BigDecimal getBalance();

	List<CharacterSheetAttributeEnhancer> getAttributeEnhancers();

	List<CharacterSheetCorporationRole> getCorporationRoles();

	List<CharacterSheetCorporationRole> getCorporationRolesAtHQ();

	List<CharacterSheetCorporationRole> getCorporationRolesAtOther();

	

}
