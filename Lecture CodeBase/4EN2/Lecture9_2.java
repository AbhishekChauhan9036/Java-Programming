public class Lecture9_2{
    public static int fib(int n){
        if(n==0 || n==1) return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        // int ans = fib(4);
        int ans = Lecture9_2.fib(5);
        System.out.println(ans);
    }
}
/**
 * TC = O(2)^n
 * SC = O(log n)
 */