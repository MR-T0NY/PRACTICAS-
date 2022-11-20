/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author banda
 */
public class DBconnection {
   
    public Connection getConn() throws SQLException{
        
        Connection conn = null;
         String myDriver = "com.mysql.Driver";                  
              String myUrl = "jdbc:mysql://localhost:3306/practicas";   
            
           try{
               Class.forName(myDriver);                  
              conn = DriverManager.getConnection(myUrl, "root", "Ac-BtMK0511");
      
           } catch (ClassNotFoundException ex){
               System.out.println(ex.toString());
           }
              
    return conn;   
}
}

