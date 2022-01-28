package gameSalesSystem.dataAccess.consrates.hibernates;

import gameSalesSystem.dataAccess.abstracts.SaleDao;
import gameSalesSystem.entities.concrates.Sale;

public class SaleHibernatesDao implements SaleDao {


	@Override
	public void add(Sale sale) {
		
		System.out.println("Added sale number: "+sale.getId()+ "to hibernates");
	}

	@Override
	public void delete(Sale sale) {
		System.out.println("Added sale number: "+sale.getId() + "from hibernates" );
	}

	@Override
	public void update(Sale sale) {
		System.out.println("Updated sale number: "+sale.getId() + "on hibernates");
	}

}
