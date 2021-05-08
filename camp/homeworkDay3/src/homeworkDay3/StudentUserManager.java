package homeworkDay3;

public class StudentUserManager extends BaseUserManager {


    public void register(StudentUser studentUser) {
        System.out.println("Öğrenci Eğitim Düzeyi : " + studentUser.geteducationDegree());
        System.out.println("Öğrenci Kaydedildi");
    }
}
