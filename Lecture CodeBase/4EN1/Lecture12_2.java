/**
 * Multilevel Inheritance
 */
class Person{
    String Name;
    String Address;
    Person(int num){
        System.out.println("this is Person Class Constructor");
        System.out.println("num: "+num);
    }
}
class Employee extends Person{
    Employee(String Address){
        super(10);
        this.Address = Address;
        System.out.println("this is Employee Class Constructor");
    }
}
class Manager extends Employee{
    Manager(String Name, String Address){
        super(Address);
        System.out.println("this is Manager Class Constructor");
        this.Name = Name;
    }
    public void getter(){
        System.out.println(this.Name);
        System.out.println(this.Address);
    }
}
public class Lecture12_2{
    public static void main(String[] args){
        Manager e1 = new Manager("Giridhar","AP");
        e1.getter();
    }
}
