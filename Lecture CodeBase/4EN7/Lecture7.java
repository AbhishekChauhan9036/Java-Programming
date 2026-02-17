class Student{
    String name;
    int age;
    String address;
    Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void printDetails(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.address);
    }
}
public class Lecture7{
    public static void main(String[] args){
        Student s1 = new Student("Hemanth",19,"Andhra Pradesh");
        s1.printDetails();
    }
}