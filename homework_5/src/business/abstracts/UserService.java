package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void sendMail(User user);
	void login(User user);
	List<User> getAll();
	
}
