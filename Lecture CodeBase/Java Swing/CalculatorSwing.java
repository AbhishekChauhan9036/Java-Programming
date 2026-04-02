import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorSwing extends JFrame implements ActionListener {

    JTextField display;          // calculator display
    String operator = "";        // stores operator
    double num1 = 0, num2 = 0;   // numbers for calculation

    CalculatorSwing() {
        setTitle("Calculator");
        setSize(300, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();                   
        display.setFont(new Font("Arial", Font.BOLD, 20));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String buttons[] = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0","C","=","+"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 16));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.matches("[0-9]")) {   // number
            display.setText(display.getText() + command);
        } 
        else if (command.equals("C")) {   // clear
            display.setText("");
            num1 = num2 = 0;
            operator = "";
        } 
        else if (command.matches("[+\\-*/]")) {   // operator
            num1 = Double.parseDouble(display.getText());
            operator = command;
            display.setText("");
        } 
        else if (command.equals("=")) {   // result
            num2 = Double.parseDouble(display.getText());

            switch (operator) {
                case "+": display.setText("" + (num1 + num2)); break;
                case "-": display.setText("" + (num1 - num2)); break;
                case "*": display.setText("" + (num1 * num2)); break;
                case "/": display.setText("" + (num1 / num2)); break;
            }
        }
    }

    public static void main(String[] args) {
        new CalculatorSwing();
    }
}