class Student{
    String name;
    int age;
    String address;
    Student(String n, int a, String add){
        name = n;
        age = a;
        address = add;
    }
    public void printDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
}
public class Lecture7{
    public static void main(String[] args){
        Student s1 = new Student("Hemanth",19,"Andhra Pradesh");
        s1.printDetails();
    }
}