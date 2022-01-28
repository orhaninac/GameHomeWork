package gameSalesSystem.dataAccess.abstracts;

import gameSalesSystem.entities.concrates.User;

public interface UserDao {
	
    void save(User user);
    void update(User user);
    void delete(User user);
    
}
