package homeworkDay5.core.concretes;

import homeworkDay5.core.abstracts.GoogleLoginService;
import homeworkDay5.google.GoogleLogin;

public class GoogleLoginAdapter implements GoogleLoginService {

	@Override
	public void registerGoogle(String message) {
		GoogleLogin googleLogin = new GoogleLogin();
		googleLogin.registerGoogle(message);

	}

}
