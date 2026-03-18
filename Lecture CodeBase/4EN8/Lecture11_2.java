class Person{
    protected String name;
    protected String Address;
    protected int age;
}
class Student extends Person{
    public void setter(String name, String Address, int age){
        this.name = name;
        this.Address = Address;
        this.age = age;
    }
}
class Faculty extends Student{
    public void getter(){
        System.out.println(this.name);
        System.out.println(this.Address);
        System.out.println(this.age);
    }
}
public class Lecture11_2{
    public static void main(String[] args){
        Faculty s1 = new Faculty();
        s1.setter("Arman","Rajkot",20);
        s1.getter();
    }
}