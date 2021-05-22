package homeworkDay3;
 
public class BaseUserManager {

    public void add(BaseUser baseUser) {
        System.out.println("Kişi ID : " + baseUser.getId());
        System.out.println("Kişi İsim : " + baseUser.getName());
        System.out.println("Kişi Tipi : " + baseUser.getType());
    }

}
