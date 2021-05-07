package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class XxxUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("XXX User ile eklendi: " + user.getUserName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendMail(User user) {
		// TODO Auto-generated method stub
		
	}

}
