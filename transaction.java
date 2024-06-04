import javax.swing.*;

// import com.mysql.cj.TransactionEventHandler;
import java.awt.*;
import java.awt.event.*;


public class transaction extends JFrame implements ActionListener{

    JButton  deposit ,withdrawl,fastcash , ministatement,pinchange , balanceenquiry, exit ;
    String pinnumber;

    transaction(String pinnumber){
        this.pinnumber = pinnumber;

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm_bank.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(0,0,900,900);
        add(Image);

        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        Image.add(text); 
        
         deposit = new JButton("deposit");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        Image.add(deposit);

         withdrawl = new JButton("cash Withdrawl");
        withdrawl.setBounds(355,415,150,30);
        withdrawl.addActionListener(this);
         Image.add(withdrawl);

         fastcash = new JButton("Fast cash");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
         Image.add(fastcash);

         ministatement = new JButton("MIni Statement");
        ministatement.setBounds(355,450,150,30);
        ministatement.addActionListener(this);
        Image.add(ministatement);

         pinchange = new JButton("Pin Change");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
         Image.add(pinchange);

         balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(355,485,150,30);
        balanceenquiry.addActionListener(this);
          Image.add(balanceenquiry);

         exit = new JButton("Exit");
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
            System.exit(0);
        } else if(ae.getSource()== deposit){
            setVisible(false);
            new deposit(pinnumber).setVisible(true);
        } else if(ae.getSource() == withdrawl){
            setVisible(false);
            new withdrawl(pinnumber).setVisible(true);

        } else if (ae.getSource()== fastcash){
             setVisible(false);
             new fastcash(pinnumber).setVisible(true);
        }else if(ae.getSource()== pinchange){
            setVisible(false);
            new pinchange(pinnumber).setVisible(true);
        }else if(ae.getSource() == balanceenquiry){
            setVisible(false);
            new balanceenquiry(pinnumber).setVisible(true);
        }else if(ae.getSource() ==ministatement ){
           
            new ministatement(pinnumber).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new transaction("");
    }
}
