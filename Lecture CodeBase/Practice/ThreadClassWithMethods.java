class A extends Thread {
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Thread A: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Thread B: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadClassWithMethods {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();

        a1.start();
        b1.start();

        System.out.println("Is Thread A alive? " + a1.isAlive());
        System.out.println("Is Thread B alive? " + b1.isAlive());

        try {
            a1.join();
            b1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Is Thread A alive after join? " + a1.isAlive());
        System.out.println("Is Thread B alive after join? " + b1.isAlive());

        System.out.println("Main thread finished");
    }
}