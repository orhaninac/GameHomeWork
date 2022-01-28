package gameSalesSystem.dataAccess.abstracts;

import gameSalesSystem.entities.concrates.Campaign;

public interface CampaignDao {
	
    void save(Campaign campaign);
    void update(Campaign campaign);
    void delete(Campaign campaign);

}
