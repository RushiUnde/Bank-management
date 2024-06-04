import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class signupthree extends JFrame implements ActionListener{

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;

    signupthree(String formno) {
        this.formno = formno;
        setLayout(null);
        JLabel l1 = new JLabel("Page 3:Account Details");
        l1.setFont(new Font("raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        JLabel type = new JLabel("Page 3:Account Type");
        type.setFont(new Font("raleway", Font.BOLD, 18));
        type.setBounds(100, 140, 200, 30);
        add(type);

        r1 = new JRadioButton("saving account");
        r1.setFont(new Font("raleway", Font.BOLD, 16));
        r1.setBackground(Color.white);
        r1.setBounds(100, 180, 200, 20);
        add(r1);

        r2 = new JRadioButton("FIxed deposit account");
        r2.setFont(new Font("raleway", Font.BOLD, 16));
        r2.setBackground(Color.white);
        r2.setBounds(350, 180, 250, 20);
        add(r2);

        r3 = new JRadioButton("Current account");
        r3.setFont(new Font("raleway", Font.BOLD, 16));
        r3.setBackground(Color.white);
        r3.setBounds(100, 220, 200, 20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit account");
        r4.setFont(new Font("raleway", Font.BOLD, 16));
        r4.setBackground(Color.white);
        r4.setBounds(350, 220, 250, 20);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("raleway", Font.BOLD, 18));
        card.setBounds(100, 300, 200, 30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("raleway", Font.BOLD, 18));
        number.setBounds(330, 300, 300, 30);
        add(number);

        JLabel carddetail = new JLabel("Your 16 Digit Card Number:");
        carddetail.setFont(new Font("raleway", Font.BOLD, 14));
        carddetail.setBounds(100, 330, 300, 20);
        add(carddetail);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("raleway", Font.BOLD, 18));
        pin.setBounds(100, 370, 200, 30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("raleway", Font.BOLD, 18));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);

        JLabel pindetail = new JLabel("Your 4 Digit Password:");
        pindetail.setFont(new Font("raleway", Font.BOLD, 14));
        pindetail.setBounds(100, 400, 300, 20);
        add(pindetail);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("raleway", Font.BOLD, 18));
        services.setBounds(100, 450, 200, 30);
        add(services);

        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1); 

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2); 
       
        c3 = new JCheckBox("Mobile  Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3); 

        c4 = new JCheckBox("Email & SMS alerts ");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4); 

        c5 = new JCheckBox("Cheque Book ");
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5); 

        c6 = new JCheckBox("E-Statement ");
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my Knowledge ");
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,625,600,30);
        add(c7); 

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(220,650,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,650,100,30);
        cancel.addActionListener(this);
        add(cancel);

        // getContentPane().setBackground(Color.WHITE);


        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
             String accountType= null;
             if(r1.isSelected()){
                accountType = "saving Account";
             } else if(r2.isSelected()){
                accountType = "Fixed Deposit Account";
             } else if(r3.isSelected()){
                accountType = "Current Account";
             } else if(r4.isSelected()){
                accountType = "recurring Deposit Account";
             }

             Random random = new Random();
            String  cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pinnumber ="" + Math.abs((random.nextLong()% 9000L) +1000L);

            String facility = "";
            if(c1.isSelected()) {
                facility = facility + "ATM Card";
            } else if(c2.isSelected()){
                facility = facility + "Internet Banking";
                
            } else if(c3.isSelected()){
                facility = facility + "Mobile Banking";
            }else if(c4.isSelected()){
                facility = facility + "Email & SMS alert";
            } else if(c5.isSelected()){
                facility = facility + "Cheque Book";
            }else if(c6.isSelected()){
                facility = facility + "E-Statement";
            }
 
           try{
              if(accountType.equals("")){
                JOptionPane.showMessageDialog(null,"Account TYpe is Required");
              } else{
                conn c = new conn();
                String query = "insert into signup3 values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                String query1 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                c.s.executeUpdate(query);
                c.s.executeUpdate(query1);


                JOptionPane.showMessageDialog(null,"card Number:" + cardnumber + "\n Pin:" + pinnumber);
                setVisible(false);
                new deposit(pinnumber).setVisible(false);
              }

           }catch(Exception e){
            System.out.println(e);
           }




        }  else if(ae.getSource() == cancel){
              setVisible(false);
              new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new signupthree("");

    }
}
