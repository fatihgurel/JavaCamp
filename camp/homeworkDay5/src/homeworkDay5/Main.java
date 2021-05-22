package homeworkDay5;

import homeworkDay5.business.concretes.UserManager;
import homeworkDay5.core.concretes.EmailValidatorManager;
import homeworkDay5.core.concretes.GoogleLoginAdapter;
import homeworkDay5.dataAccess.concretes.AbcUserDao;
import homeworkDay5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("Fatih");
		user.setLastName("Gürel");
		user.setEmail("fatihgurel.yazilim@gmail.com");
		user.setPassword("123456");

		UserManager userManager = new UserManager(new EmailValidatorManager(), new AbcUserDao(),
				new GoogleLoginAdapter());

		userManager.register(user);
		userManager.registerWithGoogle(user);
		userManager.login(user);

		System.out.println("--------------------------");

		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Mehmet");
		user1.setLastName("Gürel");
		user1.setEmail("fatihgurel.yazilim@gmail.com");
		user1.setPassword("1234567");

		userManager.register(user1);
		
		System.out.println("--------------------------");
		
		User user2 = new User();
		user2.setId(1);
		user2.setFirstName("Ahmet");
		user2.setLastName("Gürel");
		user2.setEmail("ahmetgurel!yazilim@gmail.com");
		user2.setPassword("1234567");

		userManager.register(user2);

	}
}
