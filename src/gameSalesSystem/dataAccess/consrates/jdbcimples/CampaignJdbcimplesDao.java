package gameSalesSystem.dataAccess.consrates.jdbcimples;

import gameSalesSystem.dataAccess.abstracts.CampaignDao;
import gameSalesSystem.entities.concrates.Campaign;

public class CampaignJdbcimplesDao implements CampaignDao {

	@Override
	public void save(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " is added to Jdbsimples.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " is updated on Jdbsimples.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " was deleted from Jdbsimples.");	
	}

}
