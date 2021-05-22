package homeworkDay2;
 
public class Main {

    public static void main(String[] args) {
        Category category = new Category();
        category.setCategory("Java + REACT");
        
        Instructor instructor = new Instructor();
        instructor.setInstructor("Engin DEMİROĞ");
        
        CategoryManager categoryManager = new CategoryManager();
        categoryManager.choose(category);
        
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.choose(instructor);
    }
}
