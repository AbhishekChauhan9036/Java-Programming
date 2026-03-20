/**
 * Abstract Class
 */
abstract class Person{
    abstract void printDetails();
}
class Student extends Person{
    public void printDetails(){
        System.out.println("Student Name: Govardhan");
    }
}
public class Lecture13_3{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.printDetails();
    }
}