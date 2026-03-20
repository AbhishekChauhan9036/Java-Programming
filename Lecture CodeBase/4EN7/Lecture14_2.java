// Dynamic Method Dispatch
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    // @Override
    void sound() {
        // super.sound();
        System.out.println("Dog barks");
    }
}
public class Lecture14_2 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}