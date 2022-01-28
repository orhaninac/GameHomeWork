package gameSalesSystem.dataAccess.consrates.hibernates;

import gameSalesSystem.dataAccess.abstracts.UserDao;
import gameSalesSystem.entities.concrates.User;

public class UserHibernatesDao implements UserDao{

	@Override
	public void save(User user) {	
		System.out.println(user.getFirstName() + " is added to hibernates.");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " is update on hibernates.");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " is deleted from hibernates.");
	}

}
