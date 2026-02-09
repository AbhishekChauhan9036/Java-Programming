// 1. Define an Interface
interface Animal {
    void eat(); // Abstract method (no body)

    void sleep();
}

// 2. Implement the Interface in a Class
class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("The cat eats fish.");
    }

    @Override
    public void sleep() {
        System.out.println("The cat sleeps on the sofa.");
    }
}

// 3. Test the Interface
public class InterfaceExample {
    public static void main(String[] args) {
        // Create an object of the class that implements the interface
        Animal myCat = new Cat();

        myCat.eat();
        myCat.sleep();
    }
}
