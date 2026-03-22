import java.io.*;

class OutputStreamWriterExample {
    public static void main(String[] args) throws Exception {
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        ow.write("Hello");
        ow.flush();
    }
}