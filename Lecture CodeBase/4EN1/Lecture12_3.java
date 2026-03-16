class Parent{
    void print(){
        System.out.println("This is Parent class Method");
    }
}
class Child extends Parent{
    @Override
    void print(){
        super.print();
        System.out.println("This is Child class Method");
    }
}
public class Lecture12_3{
    public static void main(String[] args){
        Child c1 = new Child();
        c1.print();
    }
}