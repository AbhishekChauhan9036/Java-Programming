//Character Streams 
import java.io.*;
public class Lecture17 {
    public static void main(String[] args) throws IOException{
        // FileInputStream fis = new FileInputStream("file.txt");
        // InputStreamReader isr = new InputStreamReader(fis);
        // int ch = isr.read();
        // while (ch != -1) {
        //     System.out.print((char) ch);
        //     ch = isr.read();
        // }
        // isr.close();
        FileOutputStream fos = new FileOutputStream("file.txt"); 
        OutputStreamWriter osw = new OutputStreamWriter(fos); 
        osw.write("Hello Java"); 
        osw.close(); 
    }
}
