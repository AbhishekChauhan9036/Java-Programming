// Mutlithreading using Runnable Interface
class A implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("A: "+i);
        }
    }
}
class B implements Runnable{
     public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("B: "+i);
        }
    }
}
public class Lecture14_2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        t1.start();
        t2.start();
    }
}
