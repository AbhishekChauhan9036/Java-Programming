class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }
}
public class ThreadPriorityExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Low");
        MyThread t2 = new MyThread("Normal");
        MyThread t3 = new MyThread("High");
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10
        t1.start();
        t2.start();
        t3.start();
    }
}