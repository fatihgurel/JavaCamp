package homeworkDay5.core.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import homeworkDay5.core.abstracts.EmailCheckService;
import homeworkDay5.entities.concretes.User;

public class EmailValidatorManager implements EmailCheckService {
	private static final String EMAIL_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
			+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

	private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

	@Override
	public boolean isValid(User user) {
		Matcher matcher = pattern.matcher(user.getEmail());
		return matcher.matches();
	}

	@Override
	public boolean sameMail(User user, List<String> emailList) {
		for (String email : emailList) {
			if (email.equals(user.getEmail())) {
				return false;
			}
		}
		return true;

	}

}
