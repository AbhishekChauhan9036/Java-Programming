/**
 * Method Overriding 
 */
class Parent{
    void print(){
        System.out.println("This is Parent Class Method");
    }
}
class Child extends Parent{
    @Override
    void print(){
        super.print();
        System.out.println("This is Child Class Method");
    }
}
public class Lecture11{
    public static void main(String[] args){
        Child c1 = new Child();
        c1.print();
    }
}