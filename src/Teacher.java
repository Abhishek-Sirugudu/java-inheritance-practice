package src;
class Teacher extends Person{
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayinfo(){
        System.out.println("Teacher Name: " + name + ", Age: " + age + ", Subject: " + subject);
    }

}
