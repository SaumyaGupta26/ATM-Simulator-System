
package bank.managment.system;

import java.sql.*;
public class Conn {

       Connection c;
       Statement s;
       public Conn(){
           try{
               
               c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "s1a2u3m4y5a6");
               s = c.createStatement();
           }catch(Exception e){
               System.out.println(e);
           }
       }
}
