// With Synchronization (Thread-Safe)
class Counter {
    int count = 0;
    synchronized void increment() {
        count++; // thread-safe
    }
}

class MyThread extends Thread {
    Counter c;
    MyThread(Counter c) {
        this.c = c;
    }
    public void run() {
        for(int i = 1; i <= 1000; i++) {
            c.increment();
        }
    }
}

public class WithSyncExample {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count (With Sync): " + c.count);
    }
}