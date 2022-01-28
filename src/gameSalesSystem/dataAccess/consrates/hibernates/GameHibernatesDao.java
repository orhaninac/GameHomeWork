package gameSalesSystem.dataAccess.consrates.hibernates;

import gameSalesSystem.dataAccess.abstracts.GameDao;
import gameSalesSystem.entities.concrates.Game;

public class GameHibernatesDao implements GameDao {

	@Override
	public void save(Game game) {
		System.out.println(game.getName() + " is added to hibernates.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " is updated to hibernates.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " was deleteded from hibernates.");
	}

}
