package gameSalesSystem.dataAccess.consrates.jdbcimples;

import gameSalesSystem.dataAccess.abstracts.UserDao;
import gameSalesSystem.entities.concrates.User;

public class UserJdbsimplesDao implements UserDao{

	@Override
	public void save(User user) {	
		System.out.println(user.getFirstName() + " is added to Jdbsimples.");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " is update on Jdbsimples.");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " is deleted from Jdbsimples.");
	}

}
