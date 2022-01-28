package gameSalesSystem.dataAccess.abstracts;

import gameSalesSystem.entities.concrates.Game;

public interface GameDao {
	
    void save(Game game);
    void update(Game game);
    void delete(Game game);

}
