package homeworkDay5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homeworkDay5.dataAccess.abstracts.UserDao;
import homeworkDay5.entities.concretes.User;

public class AbcUserDao implements UserDao {
	List<User> users;
	List<String> emailList;

	public AbcUserDao() {
		users = new ArrayList<User>();
		emailList = new ArrayList<String>();
	}

	@Override
	public void add(User user) {
		users.add(user);
		emailList.add(user.getEmail());
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullanıcısı Abc ile eklendi.");
	}

	@Override
	public void remove(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullanıcısı Abc ile silindi.");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullanıcısı Abc ile güncellendi.");
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User getById(int id) {

		for (User user : users) {
			if (user.getId() == id)
				return user;
		}

		return null;
	}

	@Override
	public List<String> getEmailList() {
		return this.emailList;
	}

}
