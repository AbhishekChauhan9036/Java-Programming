import java.io.*;

class BufferedReaderClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int num1 = Integer.parseInt(br.readLine());
        // int num2 = Integer.parseInt(br.readLine());
        // int sum = num1 + num2;
        // System.out.println(sum);

        String input = br.readLine();
        String arr[] = input.split(" ");
        int num1 = Integer.parseInt(arr[0]);
        int num2 = Integer.parseInt(arr[1]);
        int sum = num1 + num2;
        System.out.println(sum);
    }
}