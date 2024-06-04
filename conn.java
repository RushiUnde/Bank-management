
import java.sql.*;

public class conn {
    
    //register the driver
   //create connection
   //create_ statement
   //execute query
   //close connection
    
   Connection c;
   Statement s;

   public conn(){
    try{
    //    Class.forName(com.mysql.cj.jdbc.Driver);
       c= DriverManager.getConnection("jdbc:mysql:///bank","root","Jangral@123");
        s= c.createStatement();
     
        
    } catch(Exception e){
        System.out.println(e);
    }
    
   }
}

