
package bank.managment.system;
import javax.swing.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;


public class PinChange extends JFrame implements ActionListener {
    JPasswordField pin, pin2;
    JButton change , back;
    String pinnumber;
    PinChange(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Change your PIN :");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(250, 280, 180, 25);
        image.add(text);
        
        JLabel pin1 = new JLabel("New Pin :");
        pin1.setForeground(Color.WHITE);
        pin1.setFont(new Font("System", Font.BOLD, 16));
        pin1.setBounds(165, 320, 500, 35);
        image.add(pin1);
        
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        pin.setBounds(330, 320, 180, 25);
        image.add(pin);
        
        JLabel pintext = new JLabel("Re-Enter New Pin :");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System", Font.BOLD, 16));
        pintext.setBounds(165, 360, 500, 35);
        image.add(pintext);
        
        pin2 = new JPasswordField();
        pin2.setFont(new Font("Raleway", Font.BOLD, 25));
        pin2.setBounds(330, 360, 180, 25);
        image.add(pin2);
        
        change = new JButton("CHANGE");
        change.setBounds(355, 485, 150, 30);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(165, 485, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == change){
            
        
        try{
            String npin = pin.getText();
            String rpin = pin2.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            if(npin.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter new PIN");
                return;
            }
            if(rpin.equals("")){
                JOptionPane.showMessageDialog(null, "Please re-enter new PIN");
                return;
            }
            Conn conn = new Conn();
            String query1 = "update bank set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
            String query2 = "update login set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
            String query3 = "update signupthree set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
            
            conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query2);
            conn.s.executeUpdate(query3);
            
            JOptionPane.showMessageDialog(null, "PIN changed sucessfully");
            
            setVisible(false);
            new Transactions(rpin).setVisible(true);
            
        }catch(Exception e){
            System.out.println(e);
        }
        }else{
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    public static void main(String args[]) {
        new PinChange("").setVisible(true);
    }
}
