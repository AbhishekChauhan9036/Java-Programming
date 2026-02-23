public class Lecture9{
    public static int fib(int n){
        if(n==0 || n==1) return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        System.out.println(fib(4));
        System.out.println(Lecture9.fib(4));
    }
}
/**
 * TC = O(2)^n
 * SC = O(log n)
 */