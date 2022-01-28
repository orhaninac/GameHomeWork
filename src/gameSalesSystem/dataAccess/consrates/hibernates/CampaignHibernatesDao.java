package gameSalesSystem.dataAccess.consrates.hibernates;

import gameSalesSystem.dataAccess.abstracts.CampaignDao;
import gameSalesSystem.entities.concrates.Campaign;

public class CampaignHibernatesDao implements CampaignDao {

	@Override
	public void save(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " is added to hibernates.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " is updated on hibernates.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " was deleted from hibernates.");	
	}

}
