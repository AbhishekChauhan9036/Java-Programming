import java.io.*;

class FileClass {
    public static void main(String[] args) {
        File f = new File("a.txt");
        System.out.println(f.exists());
    }
}