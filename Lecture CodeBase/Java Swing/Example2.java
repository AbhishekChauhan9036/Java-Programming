import javax.swing.*;
public class Example2 extends JFrame{
    Example2(String s){
        super(s);
    }
    Example2(){}
    public static void main(String[] args) {
        Example2 e1 = new Example2("Swing Example");
        e1.setSize(500,500);
        e1.setVisible(true);
        e1.setDefaultCloseOperation(e1.EXIT_ON_CLOSE);
    }
}
