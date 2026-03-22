import java.io.*;

class FileInputOutputStream {
    public static void main(String[] args) throws Exception {
        FileOutputStream f = new FileOutputStream("a.txt");
        f.write(65);
        f.close();

        FileInputStream fi = new FileInputStream("a.txt");
        System.out.println((char) fi.read());
        fi.close();
    }
}