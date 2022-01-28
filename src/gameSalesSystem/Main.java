package gameSalesSystem;

import java.util.ArrayList;
import java.util.Date;

import gameSalesSystem.business.concrates.CampaignManager;
import gameSalesSystem.business.concrates.GameManager;
import gameSalesSystem.business.concrates.SaleManager;
import gameSalesSystem.business.concrates.UserManager;
import gameSalesSystem.core.abstracts.CheckRealPersonService;
import gameSalesSystem.core.concrates.CheckRealPersonManager;
import gameSalesSystem.dataAccess.consrates.hibernates.CampaignHibernatesDao;
import gameSalesSystem.dataAccess.consrates.hibernates.GameHibernatesDao;
import gameSalesSystem.dataAccess.consrates.hibernates.SaleHibernatesDao;
import gameSalesSystem.dataAccess.consrates.hibernates.UserHibernatesDao;
import gameSalesSystem.entities.concrates.Campaign;
import gameSalesSystem.entities.concrates.Game;
import gameSalesSystem.entities.concrates.Sale;
import gameSalesSystem.entities.concrates.User;

public class Main {

	public static void main(String[] args) {
		UserManager userManager=new UserManager(new CheckRealPersonManager(), new UserHibernatesDao());
		CheckRealPersonService checkService= new CheckRealPersonManager();
		User user1=new User(1,"orhan","inaç",new Date(1999,8,25),"26075450526");
		userManager.add(user1);
		
		
		CampaignManager campaignManager=new CampaignManager(new CampaignHibernatesDao());
		Campaign campaign1=new Campaign(1,"yilbasi indirimi",3);
		campaignManager.add(campaign1);
		
		
		GameManager gameManager=new GameManager(new GameHibernatesDao());
		Game game1=new Game(1,"tombala",10.0,2.0,"Kutu oyunu.");
		game1.setCampaign(campaign1); 
		gameManager.add(game1);
		
		
		

		SaleManager saleManager=new SaleManager(new SaleHibernatesDao(), campaignManager, campaign1,checkService);
		
		ArrayList<Game> games=new ArrayList<Game>();
		games.add(game1);
		
		Sale sales1=new Sale(1,user1,campaign1,games);
		saleManager.add(sales1);

		saleManager.makeSale(user1, campaign1, game1);
		
	}
	

}
