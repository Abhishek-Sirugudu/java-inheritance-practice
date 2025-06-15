public class Main {
    public static void main(String[] args) {

        //Student Test
        Student student = new Student("Abhishek", 20, 101, "CSE");
        student.displayStudentinfo();



        // Teacher test (method overriding)
        Teacher teacher = new Teacher("Dr. Smith", 45, "Java Programming");
        teacher.displayinfo();  // Calls overridden method
    }
}
