package GUI; 
import java.util.Scanner.*;
import javax.swing.*;

public class  TextField_area_password {
public static void main(String[] args) {
    JFrame frame = new JFrame("Main Page");
    
    // set width and height
    frame.setSize(400,400);
    frame.setLayout(null);
   
    JLabel l1 = new JLabel("Enter Name:");
    l1.setBounds(100, 70, 100, 30);

   
    JTextField t1 = new JTextField();
    t1.setBounds(100, 100, 100, 30);

    JPasswordField p1 = new JPasswordField();
    p1.setBounds(100, 150, 100, 30);

    JTextArea ta1 = new JTextArea();
    ta1.setBounds(100, 200, 100, 60);

    frame.add(l1);
    frame.add(t1);
    frame.add(p1);
    frame.add(ta1);

    frame.setVisible(true);

}


}
