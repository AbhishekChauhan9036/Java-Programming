/**
 * Abstract Class and Abstract Method
 */
abstract class A{
    abstract void fun();
    public void print(){
        System.out.println("this is normal print method of A Class");
    }
}
class B extends A{
    public void fun(){
        System.out.println("This is fun method of B Class");
    }
}
public class Lecture18_2{
    public static void main(String[] args){
        B b1 = new B();
        b1.fun();
        b1.print();
    }
}