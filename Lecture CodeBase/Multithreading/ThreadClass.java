class A extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Thread A: "+i);
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Thread B: "+i);
        }
    }
}
public class ThreadClass{
    public static void main(String[] args){
        A a1 = new A();
        B b1 = new B();
        a1.start();
        b1.start();
    }
}