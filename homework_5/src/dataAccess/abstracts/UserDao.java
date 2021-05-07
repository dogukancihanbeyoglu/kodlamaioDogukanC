package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {

	void add(User user);
	void update(User user);
	void delete(User user);
	void sendMail(User user);
	User get(String userName);
	
	List<User> getAll();
}
