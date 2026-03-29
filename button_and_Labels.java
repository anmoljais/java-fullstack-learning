package GUI; 
import java.util.Scanner.*;
import javax.swing.*;

public class button_and_Labels {
public static void main(String[] args) {
    JFrame frame = new JFrame("Main Page");
    
    // set width and height
    frame.setSize(400,400);
    frame.setLayout(null);
    frame.setVisible(true);


    JLabel l1 = new JLabel("click the Button");
        l1.setBounds(120, 65, 100, 30);
        frame.add(l1);

 
     JButton b1 = new JButton("Click me");
        b1.setBounds(120, 100, 100, 50);
        frame.add(b1);

    }
}
