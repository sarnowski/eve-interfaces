/**
 * (c) 2010 Tobias Sarnowski
 * All rights reserved.
 */
package com.eveonline.api.character;

import com.eveonline.api.ApiListResult;
import com.eveonline.api.ApiService;
import com.eveonline.api.FullApiKey;

/**
 * @author Tobias Sarnowski
 */
public interface WalletJournalApi extends ApiService {

	ApiListResult<WalletJournal> getWalletJournal(FullApiKey key, int characterId);

	ApiListResult<WalletJournal> getWalletJournal(FullApiKey key, int characterId, int beforeRefId);

}
