class ThrowableClass {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Throwable t) {
            System.out.println("Handled using Throwable");
        }
    }
}