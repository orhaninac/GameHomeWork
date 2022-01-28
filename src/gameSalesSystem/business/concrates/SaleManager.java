package gameSalesSystem.business.concrates;

import gameSalesSystem.business.abstracts.CampaignService;
import gameSalesSystem.business.abstracts.SaleService;
import gameSalesSystem.core.abstracts.CheckRealPersonService;
import gameSalesSystem.dataAccess.abstracts.SaleDao;
import gameSalesSystem.entities.concrates.Campaign;
import gameSalesSystem.entities.concrates.Game;
import gameSalesSystem.entities.concrates.Sale;
import gameSalesSystem.entities.concrates.User;

public class SaleManager implements SaleService{

	private SaleDao saleDao;
	private CheckRealPersonService checkRealPersonService;

	public SaleManager() {
		super();
	}

	public SaleManager(SaleDao saleDao, CampaignService campaignService, Campaign campaign, CheckRealPersonService checkRealPersonService) {
		super();
		this.saleDao = saleDao;
		this.checkRealPersonService=checkRealPersonService;
	}
	
	@Override
	public void add(Sale sale) {
		this.saleDao.add(sale);
	}

	@Override
	public void delete(Sale sale) {
		this.saleDao.delete(sale);
	}
	
	@Override
	public void update(Sale sale) {
		this.saleDao.update(sale);
		
	}

	@Override
	public void makeSale(User user, Campaign campaign, Game game) {
		if(checkRealPersonService.CheckIfRealPerson(user))
			System.out.println(user.getFirstName() + " bought " + game.getName() + ". Total cost with discount: " +
					game.getDiscountedPrice() + "\n Campaign: " + 
					campaign.getCampaignName()+"\n Discount price: "+game.getDiscount());
		else
			System.out.println("credential not verified");

	}





	
}
