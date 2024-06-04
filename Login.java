import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
 

public class Login extends JFrame implements ActionListener{
    
     JButton login,signup,clear;
     JTextField cardTextField;
     JPasswordField  pinTextField;
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo_bank.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new  ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);


        JLabel text = new JLabel("welcome to ATM");
        text.setFont(new Font("osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Railway",Font.BOLD,28));
        cardno.setBounds(120,150,150,40);
        add(cardno);

         cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Railway",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);

         pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        add(pinTextField);


         login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

         clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

         signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK); 
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.WHITE);
 


         setSize(800,500);
        setVisible(true);
      //    setUndecorated(true);
        setLocation(350,200);
    }

 public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == clear){
         cardTextField.setText("");
         pinTextField.setText("");
    }
    else if(ae.getSource() == login){
         conn c  = new conn();
         String cardnumber = cardTextField.getText();
         String pinnumber = pinTextField.getText();
         String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
         try{
            ResultSet rs = c.s.executeQuery(query);
            if(rs.next()){
               setVisible(false);
               new transaction(pinnumber).setVisible(true);
            }else {
               JOptionPane.showMessageDialog(null,"Incorrect card number or pin");
            }
         }catch(Exception e){
            System.out.println(e);
         }

    }
    else if(ae.getSource() == signup){
       setVisible(false);
       new SignupOne().setVisible(true);
    }
 }


    public static void main(String args[]){
        new Login();
    }
}
