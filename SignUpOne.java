
package bank.managment.system;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;


public class SignUpOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addTextField, cityTextField, stateTextField, pinTextField;
    JButton next;
    JRadioButton male, female, others, married, unmarried;
    JDateChooser dateChooser;
    SignUpOne(){
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM : PAGE 1");
        
        Random ran = new Random();
        random = (Math.abs((ran.nextLong() % 9000L) + 1000L));
        
        JLabel formNo = new JLabel("APPLICATION FORM NO. "+ random);
        formNo.setFont(new Font("Raleway", Font.BOLD, 38));
        formNo.setBounds(140, 20, 600, 40);
        add(formNo);
        
        JLabel perDetails = new JLabel("Page 1 : Personal Details ");
        perDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        perDetails.setBounds(290, 80, 400, 30);
        add(perDetails);
        
        
        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 150, 100, 30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 142, 400, 30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name :");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 200, 200, 30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 200, 400, 30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 250, 200, 30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 250, 400, 30);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 300, 200, 30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300, 300, 60, 40);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450, 300, 90, 40);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        JLabel email = new JLabel("Email Address :");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 350, 350, 30);
        add(email);
        
        
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 360, 400, 30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status :");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 400, 200, 30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(300, 400, 90, 40);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 400, 90, 40);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        others = new JRadioButton("Others");
        others.setBounds(600, 400, 90, 40);
        others.setBackground(Color.WHITE);
        add(others);
        
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(others);
        
        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 450, 100, 30);
        add(address);
        
        addTextField = new JTextField();
        addTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addTextField.setBounds(300, 450, 400, 30);
        add(addTextField);
        
        JLabel city = new JLabel("City :");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 500, 100, 30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 500, 400, 30);
        add(cityTextField);
        
        JLabel state = new JLabel("State :");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 550, 100, 30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 550, 400, 30);
        add(stateTextField);
        
        JLabel pinCode = new JLabel("Pin Code :");
        pinCode.setFont(new Font("Raleway", Font.BOLD, 20));
        pinCode.setBounds(100, 600, 100, 30);
        add(pinCode);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300, 600, 400, 30);
        add(pinTextField);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 670, 80, 30);
        next.addActionListener(this);
        add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        String formNo = "" + random;
        String name  = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        }
       String email = emailTextField.getText();
       String marital = null;
       if(unmarried.isSelected()){
           marital = "Unmarried";
       }else if(married.isSelected()){
           marital = "Married";
       }else if(others.isSelected()){
           marital = "Others";
       }
       String address = addTextField.getText();
       String city = cityTextField.getText();
       String state = stateTextField.getText();
       String pin = pinTextField.getText();
       
       try{
           if(name.equals("")){
               JOptionPane.showMessageDialog(null, "Name is required");//shows error that name is required to be filled
           }else{
               Conn c = new Conn();
               String query = "insert into signup values('"+formNo+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"', '"+city+"','"+pin+"','"+state+"')";
               c.s.executeUpdate(query);
               
               setVisible(false);
               new SignUpTwo(formNo).setVisible(true);
           }
       }catch(Exception e){
           System.out.println(e);
       }
       }
    
       
    

    
    public static void main(String args[]) {
        new SignUpOne();
    }
}
