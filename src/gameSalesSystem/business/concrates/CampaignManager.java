package gameSalesSystem.business.concrates;

import gameSalesSystem.business.abstracts.CampaignService;
import gameSalesSystem.dataAccess.abstracts.CampaignDao;
import gameSalesSystem.entities.concrates.Campaign;

public class CampaignManager implements CampaignService {
	
	private CampaignDao campaignDao;
	

	public CampaignManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		campaignDao.save(campaign);
	}

	@Override
	public void update(Campaign campaign) {
		campaignDao.update(campaign);

	}

	@Override
	public void delete(Campaign campaign) {
		campaignDao.delete(campaign);

	}

}
