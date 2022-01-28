package gameSalesSystem.business.abstracts;

import gameSalesSystem.entities.concrates.User;

public interface UserService {
	
	void add(User user);
	void update(User user);
	void delete(User user);
}
