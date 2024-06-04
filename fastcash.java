
import javax.swing.*;

// import com.mysql.cj.TransactionEventHandler;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;
import java.util.Date;


public class fastcash extends JFrame implements ActionListener{

    JButton  deposit ,withdrawl,fastcash , ministatement,pinchange , balanceenquiry, exit ;
    String pinnumber;

    fastcash(String pinnumber){
        this.pinnumber = pinnumber;

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm_bank.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(0,0,900,900);
        add(Image);

        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        Image.add(text); 
        
         deposit = new JButton("Rs 100");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        Image.add(deposit);

         withdrawl = new JButton("Rs 500");
        withdrawl.setBounds(355,415,150,30);
        withdrawl.addActionListener(this);
         Image.add(withdrawl);

         fastcash = new JButton("Rs 1000");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
         Image.add(fastcash);

         ministatement = new JButton("Rs 2000");
        ministatement.setBounds(355,450,150,30);
        ministatement.addActionListener(this);
        Image.add(ministatement);

         pinchange = new JButton("Rs 5000");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
         Image.add(pinchange);

         balanceenquiry = new JButton("Rs 10000");
        balanceenquiry.setBounds(355,485,150,30);
        balanceenquiry.addActionListener(this);
          Image.add(balanceenquiry);

         exit = new JButton("BACK");
        exit.setBounds(355,520,150,30);
        exit.addActionListener(this);
         Image.add(exit);

       
        
         setSize(900,900);
         setLocation(300,0);
        //  setUndecorated(true);
         setVisible(true);
       

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== exit){
           setVisible(false);
           new transaction(pinnumber).setVisible(true);
        } else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            conn c = new conn();
            try{
               ResultSet rs = c.s.executeQuery("select * from bank2 where pin = '"+pinnumber+"'");
               int balance =0;
               while(rs.next()){
                  if(rs.getString("type").equals("deposit")){
                        balance  += Integer.parseInt(rs.getString("amount"));
                  }else{
                     balance -= Integer.parseInt(rs.getString("amount"));
                  }
               }
               if(ae.getSource() != exit && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficent balance");
                    return;
               }

               Date date = new Date();
               String query = "insert into bank2 values('"+pinnumber+"', '"+date+"','withdrawl','"+amount+"')";
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null,"Rs"+amount+"debited Sucessfully");

               setVisible(false);
               new transaction(pinnumber).setVisible(true);
            } catch(Exception e){
                System.out.println(e);

            }
        } 
    }
    public static void main(String[] args) {
        new fastcash("");
    }
}
