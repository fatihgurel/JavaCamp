package homeworkDay5.dataAccess.abstracts;

import java.util.List;

import homeworkDay5.entities.concretes.User;

public interface UserDao {

	void add(User user);

	void remove(User user);

	void update(User user);

	List<User> getAll();

	User getById(int id);
	
	List<String> getEmailList();

}
