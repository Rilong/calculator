import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class controls extends JFrame {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    JTextField t1, t2;
    JLabel l1;

    eHundler hundler = new eHundler();



    public controls(String s) {

        super(s);



        setLayout(new FlowLayout());

        l1 = new JLabel("                                               ");

        t1 = new JTextField(20);
        t2 = new JTextField(10);
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b16 = new JButton("0");

        b10 = new JButton("+");
        b11 = new JButton("-");
        b12 = new JButton("/");
        b13 = new JButton("*");
        b14 = new JButton("=");
        b15 = new JButton("clean");

        add(t2);
        add(t1);
        add(b15);
        add(l1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b16);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);

        t1.setEditable(false);
        t2.setEditable(false);
        b15.addActionListener(hundler);
        b1.addActionListener(hundler);
        b2.addActionListener(hundler);
        b3.addActionListener(hundler);
        b4.addActionListener(hundler);
        b5.addActionListener(hundler);
        b6.addActionListener(hundler);
        b7.addActionListener(hundler);
        b8.addActionListener(hundler);
        b9.addActionListener(hundler);
        b16.addActionListener(hundler);
        b10.addActionListener(hundler);
        b11.addActionListener(hundler);
        b12.addActionListener(hundler);
        b13.addActionListener(hundler);
        b14.addActionListener(hundler);
        t2.addActionListener(hundler);


    }


    public class eHundler implements ActionListener {

        String text = "";
        String operation = "+";
        int firstValue = 0;
        int secondValue = 0;
        int result;



        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == b15) {

                t1.setText(null);
                t2.setText(null);
            }


            if (e.getSource() == b1) {

                text = t1.getText() + "1";
                t1.setText(text);
            }

            if (e.getSource() == b2) {
                text = t1.getText() + "2";
                t1.setText(text);
            }

            if (e.getSource() == b3) {
                text = t1.getText() + "3";
                t1.setText(text);
            }

            if (e.getSource() == b4) {
                text = t1.getText() + "4";
                t1.setText(text);
            }

            if (e.getSource() == b5) {
                text = t1.getText() + "5";
                t1.setText(text);
            }

            if (e.getSource() == b6) {
                text = t1.getText() + "6";
                t1.setText(text);
            }

            if (e.getSource() == b7) {
                text = t1.getText() + "7";
                t1.setText(text);
            }

            if (e.getSource() == b8) {
                text = t1.getText() + "8";
                t1.setText(text);
            }

            if (e.getSource() == b9) {
                text = t1.getText() + "9";
                t1.setText(text);
            }

            if (e.getSource() == b16) {
                text = t1.getText() + "0";
                t1.setText(text);
            }

            // operations

            try {
                if (e.getSource() == b10) {

                    firstValue = Integer.valueOf(t1.getText());
                    t1.setText("");
                    operation = "+";

                }

                if (e.getSource() == b11) {

                    firstValue = Integer.valueOf(t1.getText());
                    t1.setText("");
                    operation = "-";

                }

                if (e.getSource() == b12) {

                    firstValue = Integer.valueOf(t1.getText());
                    t1.setText("");
                    operation = "/";

                }

                if (e.getSource() == b13) {

                    firstValue = Integer.valueOf(t1.getText());
                    t1.setText("");
                    operation = "*";

                }

                if (e.getSource() == b14) {
                    secondValue = Integer.valueOf(t1.getText());

                    if ("+".equals(operation)) {
                        result = firstValue + secondValue;
                        t1.setText(firstValue + secondValue + "");
                        t2.setText(firstValue + " " + "+" + " " + secondValue + " " + "=" + " " + result);
                    }

                    if ("-".equals(operation)) {
                        result = firstValue - secondValue;
                        t1.setText(firstValue - secondValue + "");
                        t2.setText(firstValue + " " + "-" + " " + secondValue + " " + "=" + " " + result);
                    }

                    if ("/".equals(operation)) {
                        result = firstValue / secondValue;
                        t1.setText(firstValue / secondValue + "");
                        t2.setText(firstValue + " " + "/" + " " + secondValue + " " + "=" + " " + result);
                    }

                    if ("*".equals(operation)) {
                        result = firstValue * secondValue;
                        t1.setText(firstValue * secondValue + "");
                        t2.setText(firstValue + " " + "*" + " " + secondValue + " " + "=" + " " + result);
                    }


                }

            } catch (ArithmeticException ex) {
                t1.setText("деление на нуль!");
            }catch (Exception ex) {
                return;
            }
        }
    }
}
