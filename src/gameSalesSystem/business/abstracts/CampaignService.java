package gameSalesSystem.business.abstracts;

import gameSalesSystem.entities.concrates.Campaign;

public interface CampaignService {
	
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);

}
