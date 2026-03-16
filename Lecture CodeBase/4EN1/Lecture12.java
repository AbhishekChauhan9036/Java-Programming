/**
 * Single Inheritance
 */
class Person{
    String Name;
    String Address;
}
class Employee extends Person{
    public void setter(String Name, String Address){
        this.Name = Name;
        this.Address = Address;
    }
    public void getter(){
        System.out.println(this.Name);
        System.out.println(this.Address);
    }
}
public class Lecture12{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setter("Giridhar","AP");
        e1.getter();
    }
}
