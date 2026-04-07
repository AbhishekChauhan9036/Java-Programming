import javax.swing.*;
import java.awt.event.*;
public class Example extends JFrame{
    Example(){}
    Example(String s){
        super(s);
    }
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
    public void setComponents(){
        l1 = new JLabel("Addition of two Number");
        l2 = new JLabel("First Num");
        t1 = new JTextField();
        l3 = new JLabel("Second Num");
        t2 = new JTextField();
        b1 = new JButton("Add");
        l4 = new JLabel();
        setLayout(null);
        l1.setBounds(50,50,200,20);
        l2.setBounds(50,80,100,20);
        t1.setBounds(150,80,100,20);
        l3.setBounds(50,130,100,20);
        t2.setBounds(150,130,100,20);
        b1.setBounds(80,180,100,20);
        l4.setBounds(50,240,200,20);
        b1.addActionListener(new Handler());
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);
        add(l4);
    }
    class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int sum = num1+num2;
            l4.setText("Sum is: "+sum);
        }
    }

    public static void main(String[] args) {
        Example e1 = new Example("Swing Example");
        e1.setComponents();
        e1.setSize(300,300);
        e1.setVisible(true);
        e1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
