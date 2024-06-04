import java.awt.Color;

import javax.swing.*;

public class lo extends JFrame{

    

    lo(){
       
        setLayout(null);
        JFrame f = new JFrame();
        
        // setLocation(350,200);
        JLabel l1 = new JLabel("Username:");
       
        l1.setBounds(120,150,150,40);
        add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(300,150,230,30);
        add(t1);

        JLabel l2 = new JLabel("PIN:");
        l2.setBounds(120,220,250,30);
        add(l2);

        JPasswordField t2 = new JPasswordField();
        t2.setBounds(300,220,230,30);
        add(t2);

        JButton signu = new JButton("Login");
        signu.setBounds(300,310,230,30);
         add(signu);

       JButton signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
         add(signup);

         f.getContentPane().setBackground(Color.black);

         setSize(800,500);
         setVisible(true);
         setLocation(350,200);
        
    }
    public static void main(String[] args) {
        new lo();
    }
}
