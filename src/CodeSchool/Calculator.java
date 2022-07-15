package CodeSchool;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton cButton;
    private JButton button9;
    private JButton button11;
    private JButton button12;
    private JButton button16;
    private JPanel main;
    private boolean check = false;

    public Calculator() {
        setContentPane(main);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300, 300);

        a3Button.addActionListener(this);
        a6Button.addActionListener(this);
        a7Button.addActionListener(this);
        a8Button.addActionListener(this);
        a9Button.addActionListener(this);
        a0Button.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button11.addActionListener(this);
        button9.addActionListener(this);
        button12.addActionListener(this);
        button16.addActionListener(this);
        cButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button2) {
            if (check == false)
                textField1.setText(textField1.getText().concat("1"));
            else
                textField2.setText(textField2.getText().concat("1"));
        } else if (e.getSource() == button3) {
            if (check == false)
                textField1.setText(textField1.getText().concat("2"));
            else
                textField2.setText(textField2.getText().concat("2"));
        } else if (e.getSource() == a3Button) {
            if (check == false)
                textField1.setText(textField1.getText().concat("3"));
            else
                textField2.setText(textField2.getText().concat("3"));
        } else if (e.getSource() == button4) {
            if (check == false)
                textField1.setText(textField1.getText().concat("4"));
            else
                textField2.setText(textField2.getText().concat("4"));
        } else if (e.getSource() == button5) {
            if (check == false)
                textField1.setText(textField1.getText().concat("5"));
            else
                textField2.setText(textField2.getText().concat("5"));
        } else if (e.getSource() == a6Button) {
            if (check == false)
                textField1.setText(textField1.getText().concat("6"));
            else
                textField2.setText(textField2.getText().concat("6"));
        } else if (e.getSource() == a7Button) {
            if (check == false)
                textField1.setText(textField1.getText().concat("7"));
            else
                textField2.setText(textField2.getText().concat("7"));
        } else if (e.getSource() == a8Button) {
            if (check == false)
                textField1.setText(textField1.getText().concat("8"));
            else
                textField2.setText(textField2.getText().concat("8"));
        } else if (e.getSource() == a9Button) {
            if (check == false)
                textField1.setText(textField1.getText().concat("9"));
            else
                textField2.setText(textField2.getText().concat("9"));
        } else if (e.getSource() == a0Button) {
            if (check == false)
                textField1.setText(textField1.getText().concat("0"));
            else
                textField2.setText(textField2.getText().concat("0"));
        } else if (e.getSource() == button11) {
            if (check == false)
                textField1.setText(textField1.getText().concat("."));
            else
                textField2.setText(textField2.getText().concat("."));
        } else if (e.getSource() == button1) {
            check = true;
            textField3.setText("+");
        } else if (e.getSource() == button6) {
            check = true;
            textField3.setText("-");
        } else if (e.getSource() == button9) {
            check = true;
            textField3.setText("*");
        } else if (e.getSource() == button12) {
            check = true;
            textField3.setText("/");
        } else if (e.getSource() == button16) {
            if (textField3.getText().equals("+")) {
                textField1.setText(String.valueOf(Double.valueOf(textField1.getText()) + Double.valueOf(textField2.getText())));
            } else if (textField3.getText().equals("-")) {
                textField1.setText(String.valueOf(Double.valueOf(textField1.getText()) - Double.valueOf(textField2.getText())));
            } else if (textField3.getText().equals("*")) {
                textField1.setText(String.valueOf(Double.valueOf(textField1.getText()) * Double.valueOf(textField2.getText())));
            } else if (textField3.getText().equals("/")) {
                textField1.setText(String.valueOf(Double.valueOf(textField1.getText()) / Double.valueOf(textField2.getText())));
            }
            textField2.setText("");
            textField3.setText("");
        } else if (e.getSource() == cButton) {
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
        }
    }

}
