
package bank.managment.system;


import java.awt.*;
import javax.swing.*;

import java.awt.event.*;


public class SignUpTwo extends JFrame implements ActionListener{
    
   
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    String formNo;
    JComboBox religion, category, occupation, education, income;
    SignUpTwo(String formNo){
        this.formNo = formNo;
    
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM : PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2 : Additional Details ");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        
        JLabel name = new JLabel("Religion :");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 150, 100, 30);
        add(name);
        
        String varReligion[] = {"Hindu", "Muslim", "Christian", "Sikh", "Others"};
         religion = new JComboBox(varReligion);
        religion.setBounds(300, 142, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        JLabel fname = new JLabel("Category :");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 200, 200, 30);
        add(fname);
        
        String valCategory[] = {"General", "OBC", "SC", "Others"};
         category = new JComboBox(valCategory);
        category.setBounds(300, 200, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        
        JLabel dob = new JLabel("Income :");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 250, 200, 30);
        add(dob);
        
         String incomeCategory[] = {"null", "<1,50,000", "<2,50,000", "<5,00,000", "upto 10,00,000"};
         income = new JComboBox(incomeCategory);
        income.setBounds(300, 250, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
     
        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 300, 200, 30);
        add(gender);
        
        JLabel email = new JLabel("Qualification :");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 330, 350, 30);
        add(email);
        
        String eduValues[] = {"Non-Graduate", "Graduate", "Post Graduate", "Doctorate", "Ohters"};
        education = new JComboBox(eduValues);
        education.setBounds(300, 330, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
       
        
        JLabel marital = new JLabel("Occupation :");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 400, 200, 30);
        add(marital);
        
        String occupationValues[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired","Others"};
         occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 400, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
       
        
        JLabel address = new JLabel("PAN Number :");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 450, 200, 30);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 450, 400, 30);
        add(pan);
        
        JLabel city = new JLabel("Aadhar Number :");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 500, 200, 30);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 500, 400, 30);
        add(aadhar);
        
        JLabel state = new JLabel("Senior Citizen :");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 550, 200, 30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 550, 90, 40);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 550, 90, 40);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(syes);
        maritalGroup.add(sno);
       
        
        JLabel pinCode = new JLabel("Existing Account :");
        pinCode.setFont(new Font("Raleway", Font.BOLD, 20));
        pinCode.setBounds(100, 600, 200, 30);
        add(pinCode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 600, 90, 40);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 600, 90, 40);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup emaritalGroup = new ButtonGroup();
        emaritalGroup.add(eyes);
        emaritalGroup.add(eno);
        
       
        
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
        
      
        String sreligion  = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        }else if(sno.isSelected()){
             seniorcitizen = "No";
        }
      
       String existingaccount = null;
       if(eyes.isSelected()){
           existingaccount = "Yes";
       }else if(eno.isSelected()){
           existingaccount = "No";
       }
       String span = pan.getText();
       String saadhar = aadhar.getText();
      
       try{
               Conn c = new Conn();
               String query = "insert into signuptwo values('"+formNo+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"', '"+seniorcitizen+"','"+existingaccount+"')";
               c.s.executeUpdate(query);
               
               //signup3 object
               setVisible(false);
               new SignUpThree(formNo).setVisible(true);
           
        }catch(Exception e){
           System.out.println(e);
       }
    }
    
       
    

    
    public static void main(String args[]) {
        new SignUpTwo("");
    }
}

