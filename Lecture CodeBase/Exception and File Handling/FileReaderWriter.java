import java.io.*;

class FileReaderWriter {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("a.txt");
        fw.write("Hello");
        fw.close();

        FileReader fr = new FileReader("a.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}