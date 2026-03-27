/**
 * Multiple Inheritance
 */
interface A{
    int a = 10;
    void show();
}
interface B{
    void print();
}
class Test implements A, B{
    public void show(){

    }
    public void print(){
        
    }
}
public class Lecture12_2 {
    public static void main(String[] args) {
        Test t1 = new Test();
    }
}
