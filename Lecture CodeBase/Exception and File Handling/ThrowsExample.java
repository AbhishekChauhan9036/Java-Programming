class ThrowsExample {
    static void m() throws Exception {
        throw new Exception("Error from method");
    }

    public static void main(String[] args) throws Exception {
        m();
    }
}