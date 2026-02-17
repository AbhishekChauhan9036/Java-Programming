public class Main {
    static void fun(int n) {
        if (n == 0)
            return;
        for (int i = 0; i < n; i++) {
            fun(n - 1);
        }
    }
    public static void main(String[] args) {
        fun(21);
    }
}


