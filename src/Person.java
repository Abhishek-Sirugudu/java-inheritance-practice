class Person{
    protected String name;
    protected int age;

    //Constructor
    Person(String name,int age){
        this.name = name;
        this.age= age;
    }

    void displayinfo(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
