// Thread Communication (Thread-Safe Code)
class Items {
    int count = 1000;

    synchronized void consume(int n) {
        System.out.println("Consumer wants: " + n);

        while (count < n) {
            System.out.println("Not enough items... Waiting");
            try {
                wait(); // wait for producer
            } catch (Exception e) {}
        }

        count -= n;
        System.out.println("Consumed: " + n);
        System.out.println("Remaining: " + count);
    }

    synchronized void produce(int n) {
        System.out.println("Producing: " + n);

        count += n;
        System.out.println("Total: " + count);

        notify(); // wake up consumer
    }
}

// Consumer Thread
class Consumer extends Thread {
    Items obj;

    Consumer(Items obj) {
        this.obj = obj;
    }

    public void run() {
        obj.consume(1500);
    }
}

// Producer Thread
class Producer extends Thread {
    Items obj;

    Producer(Items obj) {
        this.obj = obj;
    }

    public void run() {
        obj.produce(800);
    }
}

// Main Class
public class ThreadCommunicationExample {
    public static void main(String[] args) {
        Items obj = new Items();

        Consumer c = new Consumer(obj);
        Producer p = new Producer(obj);

        c.start();
        p.start();
    }
}