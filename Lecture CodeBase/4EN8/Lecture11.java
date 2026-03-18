class Person{
    protected String name;
    protected String Address;
    protected int age;
        Person(String name){
        System.out.println("This is Person class Constructor");
        this.name = name;
    }
}
class Student extends Person{
    Student(String name, String Address, int age){
        super(name);
        System.out.println("This is Student class Constructor");
        this.Address = Address;
        this.age = age;
    }
    public void getter(){
        System.out.println(this.name);
        System.out.println(this.Address);
        System.out.println(this.age);
    }
}
public class Lecture11{
    public static void main(String[] args){
        Student s1 = new Student("Arman","Rajkot",20);
        s1.getter();
    }
}