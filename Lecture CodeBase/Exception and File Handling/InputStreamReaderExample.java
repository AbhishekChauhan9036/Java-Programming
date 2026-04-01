import java.io.*;
class InputStreamReaderExample {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter first Number: ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.print("Enter Second Number: ");
        int num2 = Integer.parseInt(br.readLine());
        
        System.out.println("Sum of Num1 & Num2: " + (num1+num2));
    }
}