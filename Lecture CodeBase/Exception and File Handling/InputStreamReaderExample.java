import java.io.*;

class InputStreamReaderExample {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter name: ");
        String s = br.readLine();
        System.out.println("You entered: " + s);
    }
}