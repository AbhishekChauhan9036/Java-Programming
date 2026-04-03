import java.io.*;
public class Lecture17_2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new 
        InputStreamReader(System.in));
        // String name = br.readLine();
        // System.out.println(name);
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
