// Dynamic Method Dispatch
class Animal{
    void sound(){
        System.out.println("Sound method of Animal class");
    }
}
class Dog extends Animal{
    // @Override
    void sound(){
        // super.sound();
        System.out.println("Sound method of Dog class");
    }
}
public class Lecture14 {
    public static void main(String[] args){
        Animal d1 = new Dog();
        d1.sound();
    }
}
