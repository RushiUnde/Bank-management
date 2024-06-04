
import javax.swing.*;
import java.awt.*;
import java.util.*;
// import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField,fnameTextField,emailTextField,AddressTextField,cityTextField,StateTextField,pinTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    // JDateChooser dateChooser;
    SignupOne(){

        setLayout(null);
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() %9000L)+1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO: "+random);
        formno.setFont(new Font("Railway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Railway",Font.BOLD,22));
        personalDetails.setBounds(290,80,450,30);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Railway",Font.BOLD,20));
        name.setBounds(100,140,150,30);
        add(name);

         nameTextField = new JTextField();
        nameTextField.setFont(new Font("Railway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Railway",Font.BOLD,20));
        fname.setBounds(100,190,150,30);
        add(fname);

         fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Railway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);

        // JLabel dob = new JLabel("Date of Birth:");
        // dob.setFont(new Font("Railway",Font.BOLD,20));
        // dob.setBounds(100,240,150,30);
        // add(dob);

        //  dateChooser = new JDateChooser();
        // dateChooser.setBounds(300,240,400,30);
        // add()
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Railway",Font.BOLD,20));
        gender.setBounds(100,290,150,30);
        add(gender);

         male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.white);
        add(male);
         female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.white);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        
        JLabel email = new JLabel("Email Adress:");
        email.setFont(new Font("Railway",Font.BOLD,20));
        email.setBounds(100,340,150,30);
        add(email);

         emailTextField = new JTextField();
        emailTextField.setFont(new Font("Railway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);

        JLabel marital = new JLabel("Martial Status:");
        marital.setFont(new Font("Railway",Font.BOLD,20));
        marital.setBounds(100,390,150,30);
        add(marital);

        //to select one for marital status
         married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.white);
        add(married);
         unmarried = new JRadioButton("unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);

         other = new JRadioButton("Others");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.white);
        add(other);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);


        JLabel Address = new JLabel("Address:");
        Address.setFont(new Font("Railway",Font.BOLD,20));
        Address.setBounds(100,440,150,30);
        add(Address);

         AddressTextField = new JTextField();
        AddressTextField.setFont(new Font("Railway",Font.BOLD,14));
        AddressTextField.setBounds(300,440,400,30);
        add(AddressTextField);


        JLabel city = new JLabel("City:");
        city.setFont(new Font("Railway",Font.BOLD,20));
        city.setBounds(100,490,150,30);
        add(city);

         cityTextField = new JTextField();
        cityTextField.setFont(new Font("Railway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);

        JLabel State = new JLabel("State:");
        State.setFont(new Font("Railway",Font.BOLD,20));
        State.setBounds(100,540,150,30);
        add(State);

         StateTextField = new JTextField();
        StateTextField.setFont(new Font("Railway",Font.BOLD,14));
        StateTextField.setBounds(300,540,400,30);
        add(StateTextField);

        JLabel PinCode = new JLabel("PinCode:");
        PinCode.setFont(new Font("Railway",Font.BOLD,20));
        PinCode.setBounds(100,590,150,30);
        add(PinCode);

         pinTextField = new JTextField();
        pinTextField.setFont(new Font("Railway",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);


         next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Railway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
         String formno = ""+ random;
         String name =  nameTextField.getText();
         String fname = fnameTextField.getText();
        //  String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        } else if(female.isSelected()){
            gender = "female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        } else if(unmarried.isSelected()){
            marital = "unmarried";
        } else if(other.isSelected()){
            marital = "other";
        }

        String Address = AddressTextField.getText();
        String city = cityTextField.getText();
        String state = StateTextField.getText();
        String pin = pinTextField.getText();

        try{
           if(name.equals("")){
                  JOptionPane.showMessageDialog(null,"Name is required");
           } else{
              conn c = new conn();
              String query = "insert into signup values ('"+formno+"', '"+name+"','"+fname+"', '"+gender+"','"+email+"','"+marital+"','"+Address+"','"+city+"','"+pin+"','"+state+"')";
              c.s.executeUpdate(query);

              setVisible(false);
              new Signuptwo(formno).setVisible(true);
           }
        } catch(Exception e ){
            System.out.println(e);
        }
    }


        // "String'"+variable+"'String"
    public static void main(String[] args) {
        new SignupOne();
    }
}
