/**
 * Abstract Class & Abstract Method
 */
abstract class A{
    abstract void fun();
    public void show(){
        System.out.println("this is normal show method of Abstract A Class");
    }
}
class B extends A{
    public void fun(){
        System.out.println("This is fun method of B Class");
    }
}
public class Lecture14{
    public static void main(String[] args){
        A b1 = new B();
        if (b1 instanceof B) {
            System.out.println("b1 is object of B class");
        }
        b1.show();
        b1.fun();
    }
}