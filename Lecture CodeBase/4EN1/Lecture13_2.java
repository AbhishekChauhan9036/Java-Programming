/**
 * Multiple Inheritance
 */
interface A{
    void print();
}
interface B{
    void show();
}
class C implements A, B{
    public void print(){
        System.out.println("This is print method of C Class");
    }
    public void show(){
        System.out.println("This is show method of C Class");
    }
}
public class Lecture13_2{
    public static void main(String[] args){
        C c1 = new C();
        c1.print();
        c1.show();
    }
}