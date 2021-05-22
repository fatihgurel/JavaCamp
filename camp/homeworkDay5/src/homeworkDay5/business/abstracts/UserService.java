package homeworkDay5.business.abstracts;

import homeworkDay5.entities.concretes.User;

public interface UserService {
	void register(User user);

	void login(User user);

	void registerWithGoogle(User user);
}
