
import business.abstracts.UserService;
import business.concretes.UserManager;
import core.GoogleServiceAdapter;
import dataAccess.concretes.XxxUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new XxxUserDao(), new GoogleServiceAdapter());
		
		User user = new User ("Doðukan","Cihanbeyoðlu","dogukan123.cihan.5@gmail.com","16547896513549");
		userService.add(user);
		userService.sendMail(user);
		userService.login(user);
		
	}

	
	
}
