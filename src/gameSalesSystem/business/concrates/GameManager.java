package gameSalesSystem.business.concrates;

import gameSalesSystem.business.abstracts.GameService;
import gameSalesSystem.dataAccess.abstracts.GameDao;
import gameSalesSystem.entities.concrates.Game;

public class GameManager implements GameService{
	
    private GameDao gameDao;
	
    public GameManager(GameDao gameDAO) {
        this.gameDao = gameDAO;
    }


	@Override
	public void add(Game game) {
		gameDao.save(game);
		
	}


	@Override
	public void update(Game game) {
		gameDao.update(game);
	}


	@Override
	public void delete(Game game) {
		gameDao.delete(game);	
	}
}
