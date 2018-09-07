/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ACO;
import java.sql.*;
/**
 *
 * @author EGC07
 */
public class conn {
  Connection con=null;
   
    public conn() 
    {
     try
    {
         Class.forName("com.mysql.jdbc.Driver").newInstance();
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aco?","root","");
    }
    catch(Exception e)
        {

        }
    }
   
  
}
