public class Lecture8{
    public static int fib(int n){
        if(n==1 || n==0) return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        int ans = fib(4);
        ans = Lecture8.fib(4);
        System.out.println(ans);
    }
}
/**
 * TC = O(2)^n
 * SC = O(log n)
 */