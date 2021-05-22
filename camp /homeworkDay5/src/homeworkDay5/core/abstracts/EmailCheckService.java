package homeworkDay5.core.abstracts;

import java.util.List;

import homeworkDay5.entities.concretes.User;

public interface EmailCheckService {
	boolean isValid(User user);
	boolean sameMail(User user,List<String> emailList);
}
