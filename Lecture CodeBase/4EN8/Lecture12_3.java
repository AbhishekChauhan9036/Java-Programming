abstract class A{
    abstract void show();
}
class B extends A{
    public void show(){
        System.out.println("Show Method");
    }
}
public class Lecture12_3 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.show();
    }
}
