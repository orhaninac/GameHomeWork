package gameSalesSystem.dataAccess.consrates.jdbcimples;

import gameSalesSystem.dataAccess.abstracts.SaleDao;
import gameSalesSystem.entities.concrates.Sale;

public class SaleJdbcimplesDao implements SaleDao {
	@Override
	public void add(Sale sale) {
		
		System.out.println("Added sale number: "+sale.getId()+ "to Jdbcimples");
	}

	@Override
	public void delete(Sale sale) {
		System.out.println("Added sale number: "+sale.getId() + "from Jdbcimples" );
	}

	@Override
	public void update(Sale sale) {
		System.out.println("Updated sale number: "+sale.getId() + "on Jdbcimples");
	}

}
