package gameSalesSystem.business.abstracts;

import gameSalesSystem.entities.concrates.Campaign;
import gameSalesSystem.entities.concrates.Game;
import gameSalesSystem.entities.concrates.Sale;
import gameSalesSystem.entities.concrates.User;

public interface SaleService {
	
	void add(Sale sale);
	void delete(Sale sale);
	void update(Sale sale);
	void makeSale(User customer, Campaign campaign, Game game);

}
