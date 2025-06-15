class Student extends Person{
    private int rollNo;
    private String branch;

    // Constructor
    public Student(String name, int age, int rollNo, String branch) {
        super(name, age);  // Calls Person's constructor
        this.rollNo = rollNo;
        this.branch = branch;
    }

    public void displayStudentinfo(){
        super.displayinfo();
        System.out.println("Roll No: " + rollNo + ", Branch: " + branch);
    }
}
