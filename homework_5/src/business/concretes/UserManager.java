package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import core.GoogleService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private GoogleService googleService;
	
	public UserManager(UserDao userDao,GoogleService googleService) {
		this.userDao = userDao;
		this.googleService =googleService;
	}
	
	
	@Override
	public void add(User user) {
		
		if(user.getPassword().length() < 6 ){
			System.out.println("�ifre 6 karakterden az olamaz!");
			return;
		}
		if((user.getUserName().length() < 2) || (user.getLastName().length() < 2)){
			System.out.println("Ad veya Soyad bilgisi 2 karakterden az olamaz!");
			return;
		}
		
		//this.userDao.add(user);
		this.googleService.logWithGoogle("Kullan�c� GoogleMail ile giri� yapt�."+ user.geteMail());
		System.out.println("Sisteme ba�ar�l� �ekilde kay�t edilmi�tir: "+ user.getUserName() + user.getLastName());
	}
	
	@Override
	public void sendMail(User user) {
		this.userDao.sendMail(user);
		System.out.println("Mail adresinize do�rulama maili g�nderilmi�tir: " + user.geteMail());
		
	}
	@Override
	public void login(User user) {
		this.userDao.sendMail(user);
		System.out.println("Sisteme ho�geldin! "+ user.getUserName());
	}
	
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}





	

}
