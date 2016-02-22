import javax.swing.*;

public class Main {

    public static void main(String args[]) {

        controls ctr = new controls("Calculator");

        ctr.setVisible(true);
        ctr.setSize(250, 230);
        ctr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ctr.setResizable(false);
        ctr.setLocationRelativeTo(null);
    }
}
