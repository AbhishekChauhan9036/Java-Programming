// class Parent{
//     int a;
//     Parent(int a){
//         this.a = a;
//         System.out.println("This is Parent Class Constructor");
//     }
// }
// class Child extends Parent{
//     int x , y;
//     Child(int x, int y){
//         super(x);
//         this.x = x;
//         this.y = y;
//         System.out.println("This is Child Class Constructor");
//     }
// }

class Parent{
    void print(){
        System.out.println("Parent Class print Method");
    }
}
class Child extends Parent{
    @Override
    void print(){
        super.print();
        System.out.println("Child Class print Method");
    }
}
public class Lecture15{
    public static void main(String[] args){
        Child c1 = new Child();
        c1.print();
    }
}