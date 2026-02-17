class Student{
    String name;
    int age;
    String address;

    //Default Constructor
    Student(){
        System.out.println("By Default Constructor is called");
    }
    
    // Parameterized Construtor
    Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void printDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
}
public class Lecture8{
    public static void main(String[] args){
        Student s1 = new Student("Naresh", 19, "Andhra Pradesh");
        s1.printDetails();
    }
}