/**
 * Multiple Inheritance
 */
interface A{
    void fun();
}
interface B{
    void show();
}
class C implements A, B{
    public void fun(){
        System.out.println("This is fun method");
    }
    public void show(){
        System.out.println("This is show method");
    }
}
public class Lecture18{
    public static void main(String[] args){
        C c1 = new C();
        c1.fun();
        c1.show();
    }
}