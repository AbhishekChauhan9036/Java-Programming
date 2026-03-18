class Parent{
    void print(){
        System.out.println("this is print method of Parent Class");
    }
}
class Child extends Parent{
    @Override
    void print(){
        super.print();
        System.out.println("this is print method of Child Class");
    }
}

public class Lecture11_3{
    public static void main(String[] args){
        Child c1 = new Child();
        c1.print();
    }
}