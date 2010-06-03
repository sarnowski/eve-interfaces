/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.img;

import com.eveonline.api.ApiService;

import java.io.InputStream;

/**
 * @author Tobias Sarnowski
 */
public interface CharacterPortraitApi extends ApiService {

	InputStream getCharacterPortrait(int characterId, int size);

}
