package gameSalesSystem.dataAccess.abstracts;

import gameSalesSystem.entities.concrates.Sale;

public interface SaleDao {
	
	public void add(Sale sales);
	public void delete(Sale sales);
	public void update(Sale Sale);

}
