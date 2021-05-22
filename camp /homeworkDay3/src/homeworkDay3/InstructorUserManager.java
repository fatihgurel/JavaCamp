package homeworkDay3;
 
public class InstructorUserManager extends BaseUserManager {

    public void register(InstructorUser instructorUser) {
        System.out.println("Eğitmen Alanı : " + instructorUser.getBranch());
        System.out.println("Eğitmen Kaydedildi");
    }
}
