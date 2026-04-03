import java.io.*;
public class Lecture16 {
    public static void main(String[] args)throws IOException {
        // FileInputStream fis = new FileInputStream("file.txt");
        // int data = fis.read();
        // while (data != -1) {
        //     System.out.print((char) data);
        //     data = fis.read();
        // }
        // fis.close();
        FileOutputStream fos = new FileOutputStream("file.txt"); 
        fos.write("Java Programming Syllabus".getBytes()); 
        fos.close(); 
    }
}