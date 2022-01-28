package gameSalesSystem.dataAccess.consrates.jdbcimples;

import gameSalesSystem.dataAccess.abstracts.GameDao;
import gameSalesSystem.entities.concrates.Game;

public class GameJdbcimplesDao implements GameDao {

	@Override
	public void save(Game game) {
		System.out.println(game.getName() + " is added to Jdbsimples.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " is updated to Jdbsimples.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " was deleteded from Jdbsimples.");
	}

}
