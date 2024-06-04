import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.awt.event.*;

public class applicationform extends JFrame implements ActionListener{

    applicationform(){

        setTitle("VIT COLLEGE");

        setLayout(null);
       JFrame f = new JFrame();

       

       JLabel l0 = new JLabel("VIT COLLEGE");
       l0.setFont(new Font("osward",Font.BOLD,38));
       l0.setBounds(270,10,290,80);
       add(l0);

       JLabel l = new JLabel("REGISTRATION FORM");
       l.setBounds(310,70,150,40);
       add(l);

       JLabel l1 = new JLabel("NAME:");
       l1.setBounds(210,110,80,40);
       add(l1);

       JTextField t1 = new JTextField();
       t1.setBounds(270,110,190,40);
       add(t1);

       JLabel l2 = new JLabel("REG NO:");
       l2.setBounds(210,160,80,40);
       add(l2);

       JTextField t2 = new JTextField();
       t2.setBounds(270,160,190,40);
       add(t2);
       

       JLabel l4 = new JLabel("TYPE:");
       l4.setBounds(210,220,80,40);
       add(l4);

       String [] a = {"under graduate", "post-graduate","researcher"} ;
       JComboBox l3 = new JComboBox(a);
       l3.setBounds(270,220,190,40);
       add(l3);

       JLabel l5 = new JLabel("GENDER:");
       l5.setBounds(210,260,80,40);
       add(l5);

       JRadioButton male = new JRadioButton("Male");
       male.setBounds(300,260,80,40);
       add(male);
       JRadioButton female = new JRadioButton("Female");
       female.setBounds(380,260,80,40);
       add(female);

       ButtonGroup gendergroup = new ButtonGroup();
       gendergroup.add(male);
       gendergroup.add(female);

       JLabel l7 = new JLabel("BRANCH:");
       l7.setBounds(210,300,80,40);
       add(l7);

       String [] b = {"CS", "IT","ENTC","INSTRU","CHEM","other"} ;
       JComboBox l6 = new JComboBox(b);
       l6.setBounds(270,300,190,40);
       add(l6);

       JLabel l8 = new JLabel("ADRESS:");
       l8.setBounds(210,350,80,40);
       add(l8);

       JTextField t8 = new JTextField();
       t8.setBounds(270,350,190,60);
       add(t8);

       JButton clear = new JButton("CLEAR");
       clear.setBounds(270,420,90,30);
       add(clear);

       JButton signup = new JButton("SUBMIT");
       signup.setBounds(380,420,80,30);
       add(signup);

    //    getContentPane().setBackground(Color.WHITE);
    f.setContentPane(new JLabel(new ImageIcon("D:\\New folder (4)\\jaksh jangral.png"))); 
      
  

      
       setSize(800,500);
       setVisible(true);
       setLocation(300,200);

    }


    public void actionPerformed(ActionEvent ae){

        String name =  nameTextField.getText();


        try{
           
               conn c = new conn();
               String query = "insert into signup values ( '"+name+"','"+fname+"', '"+gender+"','"+email+"','"+marital+"','"+Address+"','"+city+"','"+pin+"','"+state+"')";
               c.s.executeUpdate(query);
 
               setVisible(false);
               new Signuptwo(formno).setVisible(true);
            
         } catch(Exception e ){
             System.out.println(e);
         }
    }


    public static void main(String[] args) {
        new applicationform();
    }
}
