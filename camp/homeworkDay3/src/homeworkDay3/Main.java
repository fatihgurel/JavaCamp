package homeworkDay3;

public class Main {

    public static void main(String[] args) {
        InstructorUser instructorUser = new InstructorUser();
        instructorUser.setId(1);
        instructorUser.setName("Engin Demiroğ");
        instructorUser.setType("Eğitmen");
        instructorUser.setBranch("Yazılım Geliştirici");
        
        StudentUser studentUser = new StudentUser();
        studentUser.setId(2);
        studentUser.setName("Fatih Gürel");
        studentUser.setType("Öğrenci");
        studentUser.seteducationDegree("Lisans");
        
        InstructorUserManager instructorUserManager = new InstructorUserManager();
        instructorUserManager.add(instructorUser);
        instructorUserManager.register(instructorUser);
        System.out.println("-------------------------");
        StudentUserManager studentUserManager = new StudentUserManager();
        studentUserManager.add(studentUser);
        studentUserManager.register(studentUser);
    }
}
