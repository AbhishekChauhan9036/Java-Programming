import java.io.*;
public class Lecture17_3 {
    public static void main(String[] args)throws IOException {
        // BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        // String line;
        // while((line = br.readLine()) != null){
        //     System.out.println(line);
        // }
        // br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"));
        bw.write("Java Programming");
        bw.newLine();
        bw.write("C++");
        bw.newLine();
        bw.write("Python");
        bw.close();
    }
}
