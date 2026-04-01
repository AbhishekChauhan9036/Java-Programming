import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Lecture15_2 {
    public static void main(String[] args) throws Exception {
        // FileInputStream fis = new FileInputStream("file.txt");
        // int data = fis.read();
        // while (data != -1) {
        //     System.out.print((char) data);
        //     data = fis.read();
        // }
        // fis.close();
        FileOutputStream fos = new FileOutputStream("file.txt"); 
        fos.write("Uttam Kumar Prajapati".getBytes()); 
        fos.close();
    }
}
