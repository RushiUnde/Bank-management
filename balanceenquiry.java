
import javax.annotation.processing.SupportedOptions;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class balanceenquiry extends JFrame implements ActionListener{

    JButton back;
    String pinnumber;

    balanceenquiry(String pinnumber){
        this.pinnumber = pinnumber;

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm_bank.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

         back = new JButton("Back");
         back.setBounds(355,520,150,30);
         back.addActionListener(this);
        image.add(back);

        conn c = new conn();
        int balance =0;
        try{
           ResultSet rs = c.s.executeQuery("select * from bank2 where pin = '"+pinnumber+"'");
          
           while(rs.next()){
              if(rs.getString("type").equals("deposit")){
                    balance  += Integer.parseInt(rs.getString("amount"));
              }else{
                 balance -= Integer.parseInt(rs.getString("amount"));
              }}
           }catch(Exception e){
             System.out.println(e);
           } 

           JLabel  text = new JLabel("your current account balance is"+ balance);
           text.setForeground(Color.WHITE);
           text.setBounds(170,300,400,30);
           image.add(text);

        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        new transaction(pinnumber).setVisible(true);
    }
    public static void main(String[] args) {
        new balanceenquiry("");
    }
}
