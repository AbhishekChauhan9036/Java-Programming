import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Lecture21 {
    public static void main(String[] args) throws IOException{
        // FileInputStream fis = new FileInputStream("file.txt");
        // int data = fis.read();
        // while (data != -1) {
        //     System.out.print((char) data);
        //     data = fis.read();
        // }
        // fis.close();
        FileOutputStream fos = new FileOutputStream("file.txt"); 
        fos.write("This is your Java Programming Lecture".getBytes()); 
        fos.close();
    }
}
