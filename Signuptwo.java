
import javax.swing.*;
import java.awt.*;
import java.util.*;
// import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


//imp points:
//1) combo box for religions

public class Signuptwo extends JFrame implements ActionListener {

    // long random;
    JTextField nameTextField,fnameTextField,emailTextField,panTextField,cityTextField,StateTextField,pinTextField,adharTextField;
    JButton next;
    JRadioButton male,female,other,syes,sno,eyes,eno;
    JComboBox religion,Category,occupation,education;
    String formno;
    // JDateChooser dateChooser;
    Signuptwo(String formno){
        this.formno = formno;

        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM--PAGE 2");
        

        // JLabel formno = new JLabel("APPLICATION FORM NO: "+random);
        // formno.setFont(new Font("Railway",Font.BOLD,38));
        // formno.setBounds(140,20,600,40);
        // add(formno);

        JLabel additionalDetails = new JLabel("Page 1: Additional  Details");
        additionalDetails.setFont(new Font("Railway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,450,30);
        add(additionalDetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Railway",Font.BOLD,20));
        name.setBounds(100,170,150,30);
        add(name);
          
        String valReligion[]= {"Hindu","Muslim","Sikh","christian","Others"};
         religion = new JComboBox(valReligion);
        religion.setBounds(300,170,400,30);
        religion.setBackground(Color.white);
        add(religion);

         
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Railway",Font.BOLD,20));
        fname.setBounds(100,230,150,30);
        add(fname);

        String valCategory[]= {"General","OBC","SC","ST","Others"};
         Category = new JComboBox(valCategory);
        Category.setBounds(300,230,400,30);
        religion.setBackground(Color.white);
        add(Category);

        // JLabel dob = new JLabel("Date of Birth:");
        // dob.setFont(new Font("Railway",Font.BOLD,20));
        // dob.setBounds(100,240,150,30);
        // add(dob);

        //  dateChooser = new JDateChooser();
        // dateChooser.setBounds(300,240,400,30);
        // add()
        
        JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Railway",Font.BOLD,20));
        gender.setBounds(100,290,150,30);
        add(gender);

        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Railway",Font.BOLD,20));
        email.setBounds(100,315,150,30);
        add(email);
         
        String educationValue[]= {"Non-Graduation","Graduation","Post Graduation","Doctrate","Others"};
         education = new JComboBox(educationValue);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.white);
        add(education);

        //  emailTextField = new JTextField();
        // emailTextField.setFont(new Font("Railway",Font.BOLD,14));
        // emailTextField.setBounds(300,340,400,30);
        // add(emailTextField);

        JLabel occupationn = new JLabel("Occupation:");
        occupationn.setFont(new Font("Railway",Font.BOLD,20));
        occupationn.setBounds(100,390,150,30);
        add(occupationn);

        String occupationValue[]= {"Salaried","Self-employed","Bussiness","Student","Retired","Others"};
         occupation = new JComboBox(occupationValue);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.white);
        add(occupation);



        //to select one for marital status
        //  married = new JRadioButton("Married");
        // married.setBounds(300,390,100,30);
        // married.setBackground(Color.white);
        // add(married);
        //  unmarried = new JRadioButton("unmarried");
        // unmarried.setBounds(450,390,100,30);
        // unmarried.setBackground(Color.white);
        // add(unmarried);

        //  other = new JRadioButton("Others");
        // other.setBounds(630,390,100,30);
        // other.setBackground(Color.white);
        // add(other);

        // ButtonGroup maritalgroup = new ButtonGroup();
        // maritalgroup.add(married);
        // maritalgroup.add(unmarried);
        // maritalgroup.add(other);


        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Railway",Font.BOLD,20));
        pan.setBounds(100,440,150,30);
        add(pan);

         panTextField = new JTextField();
        panTextField.setFont(new Font("Railway",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);


        JLabel adhar = new JLabel("Adhar number:");
        adhar.setFont(new Font("Railway",Font.BOLD,20));
        adhar.setBounds(100,490,150,30);
        add(adhar);

         adharTextField = new JTextField();
        adharTextField.setFont(new Font("Railway",Font.BOLD,14));
        adharTextField.setBounds(300,490,400,30);
        add(adharTextField);

        JLabel Senior = new JLabel("Senior Citizen:");
        Senior.setFont(new Font("Railway",Font.BOLD,20));
        Senior.setBounds(100,540,150,30);
        add(Senior);

        syes = new JRadioButton("YES");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.white);
        add(syes);
         sno = new JRadioButton("NO");
         sno.setBounds(450,540,100,30);
         sno.setBackground(Color.white);
        add(sno);



        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);

        //  StateTextField = new JTextField();
        // StateTextField.setFont(new Font("Railway",Font.BOLD,14));
        // StateTextField.setBounds(300,540,400,30);
        // add(StateTextField);

        JLabel Existing = new JLabel("Existing Account:");
        Existing.setFont(new Font("Railway",Font.BOLD,20));
        Existing.setBounds(100,590,150,30);
        add(Existing);

        eyes = new JRadioButton("YES");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.white);
        add(eyes);
         eno = new JRadioButton("NO");
         eno.setBounds(450,590,100,30);
         eno.setBackground(Color.white);
        add(eno);



        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);

        //  pinTextField = new JTextField();
        // pinTextField.setFont(new Font("Railway",Font.BOLD,14));
        // pinTextField.setBounds(300,590,400,30);
        // add(pinTextField);


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
        //  String formno = ""+ random;
         String sreligion = (String) religion.getSelectedItem();
         String scategory = (String)  Category.getSelectedItem();
         String seducation =  (String) education.getSelectedItem();
         String soccupation = (String) occupation.getSelectedItem();
        //  String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String senior = null;
        if(syes.isSelected()){
            senior = "YES";
        } else if(sno.isSelected()){
            senior = "NO";
        }
        String existing = null;
        if(eyes.isSelected()){
            existing = "YES";
        } else if(eno.isSelected()){
            existing = "NO";
        }

        String span = panTextField.getText();
        String saadhar = adharTextField.getText();


        try{

              conn c = new conn();
              String query = "insert into signup2 values ('"+formno+"', '"+sreligion+"','"+scategory+"', '"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+senior+"','"+existing+"')";
              c.s.executeUpdate(query);

              //signup3 object
              setVisible(false);
              new signupthree(formno).setVisible(true);

           
        } catch(Exception e ){
            System.out.println(e);
        }
    }


        // "String'"+variable+"'String"
    public static void main(String[] args) {
        new Signuptwo("");
    }
}
