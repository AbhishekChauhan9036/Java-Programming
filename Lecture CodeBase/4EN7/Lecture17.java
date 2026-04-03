import java.io.*;
public class Lecture17 {
    public static void main(String[] args)throws IOException {
        // BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        // String line;
        // while ((line = br.readLine()) != null) {
        //     System.out.println(line);
        // }

        BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"));
        bw.write("Hello This is first line");
        bw.newLine();
        bw.write("This is Second line i");
        bw.close();
    }
}
