package homeworkDay5.business.concretes;
 
import homeworkDay5.business.abstracts.UserService;
import homeworkDay5.core.abstracts.EmailCheckService;
import homeworkDay5.core.abstracts.GoogleLoginService;
import homeworkDay5.dataAccess.abstracts.UserDao;
import homeworkDay5.entities.concretes.User;

public class UserManager implements UserService {

	private EmailCheckService emailCheckService;
	private UserDao userDao;
	private GoogleLoginService googleService;

	public UserManager(EmailCheckService emailCheckService, UserDao userDao, GoogleLoginService googleService) {
		this.emailCheckService = emailCheckService;
		this.userDao = userDao;
		this.googleService = googleService;
	}

	@Override
	public void register(User user) {
		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.err.println("İsim ve soyisim en az 2 karakterden oluşmalıdır! Kayıt başarısız");
		} else if (!emailCheckService.isValid(user)) {
			System.err.println("Geçersiz email! Kayıt başarısız.");
		} else if (user.getPassword().length() < 6) {
			System.err.println("Parola en az 6 karakterden oluşmalıdır! Kayıt başarısız.");
		}else if(!emailCheckService.sameMail(user, userDao.getEmailList())) {
			System.err.println("Bu mail adresi daha önce kullanılmış");
		}
		else {
			userDao.add(user);
		}

	}

	@Override
	public void login(User user) {
		System.out.println("Hoşgeldiniz " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void registerWithGoogle(User user) {
		googleService.registerGoogle(user.getFirstName() + " " + user.getLastName());
	}

}
