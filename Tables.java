package GUI ;
import javax.swing.*;
import java.awt.*;

public class Tables {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Page");

        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String colums[] = {"ID","Name","Salary"};
        String data[][] = {{"100","thor","50000"}};

        JTable tb1 = new JTable(data, colums);

        JScrollPane sp = new JScrollPane(tb1);

        frame.add(sp, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}