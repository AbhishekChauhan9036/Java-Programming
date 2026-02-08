class Animal {
    void speak() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("The dog barks");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.speak();
        System.out.println("Hello");
        System.out.println("World");
    }
}
