class Student{
    Student(){
        System.out.println("this is Default Constructor");
    }
    Student(int age){
        this();
        System.out.println(age);
    }
}

class Employee{
    static String name = "Sohan";
    int id;
    Employee(int id){
        this.id = id;
    }

    public void printDetails(){
        System.out.println(name);
        System.out.println(this.id);
    }
}

public class Lecture8_2{
    public static void main(String[] args){
        // Student s1 = new Student(20);
        Employee e1 = new Employee(2656);
        e1.printDetails();
    }
}