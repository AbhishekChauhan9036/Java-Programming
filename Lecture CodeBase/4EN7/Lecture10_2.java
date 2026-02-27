class Parent{
    protected int age;
    protected String name;
    Parent(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("This is Parent class Constructor");
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }
}
class Child extends Parent{
    Child(int age, String name){
        super(age, name);
        System.out.println("This is Child class Constructor");
    }
}
public class Lecture10_2{
    public static void main(String[] args){
        Child c1 = new Child(60, "Sohan");
    }
}