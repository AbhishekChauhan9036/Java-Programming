class A {
    synchronized void methodA(B b) {
        System.out.println("Thread-1: Holding A, waiting for B...");
        try { Thread.sleep(100); } catch (Exception e) {}

        synchronized (b) {
            System.out.println("Thread-1: Acquired B");
        }
    }
}

class B {
    synchronized void methodB(A a) {
        System.out.println("Thread-2: Holding B, waiting for A...");
        try { Thread.sleep(100); } catch (Exception e) {}

        synchronized (a) {
            System.out.println("Thread-2: Acquired A");
        }
    }
}

class Thread1 extends Thread {
    A a;
    B b;

    Thread1(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        a.methodA(b);
    }
}

class Thread2 extends Thread {
    A a;
    B b;

    Thread2(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        b.methodB(a);
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        Thread1 t1 = new Thread1(a, b);
        Thread2 t2 = new Thread2(a, b);

        t1.start();
        t2.start();
    }
}