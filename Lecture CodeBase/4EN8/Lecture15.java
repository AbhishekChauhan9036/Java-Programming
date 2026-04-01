public class Lecture15 {
    public static void main(String[] args) throws Exception{
        try {
            int a[] = new int[5];
            a[5] = 30;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("Remaining code gets executed");
    }
}