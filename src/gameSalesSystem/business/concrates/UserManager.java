package gameSalesSystem.business.concrates;

import gameSalesSystem.adapter.abstracts.CheckRealPersonService;
import gameSalesSystem.business.abstracts.UserService;
import gameSalesSystem.dataAccess.abstracts.UserDao;
import gameSalesSystem.entities.concrates.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private CheckRealPersonService checkService;
	

	public UserManager(CheckRealPersonService personCheckService, UserDao userDao) {
		super();
		this.checkService = personCheckService;
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		if(checkService.CheckIfRealPerson(user)) {
			userDao.save(user);
		}else {
			System.out.println("credential not verified.");
		}
	}

	@Override
	public void update(User user) {
		if(checkService.CheckIfRealPerson(user)) {
			userDao.update(user);
		}else {
			System.out.println("credential not verified.");
		}
	}

	@Override
	public void delete(User user) {
		if(checkService.CheckIfRealPerson(user)) {
			userDao.delete(user);
		}else {
			System.out.println("credential not verified.");
		}
	}

}
