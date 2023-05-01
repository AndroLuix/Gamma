/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package md.corsojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author nomeCognome data
 */


public class Database {

    public static void main (String[] args) throws Exception{
      //dovrebbe non essere più necessaria questa classe
      Class.forName("com.mysql.jdbc.Driver");
      
      try {
          
            //Connessione con il DB
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");  
      
            // Query
            PreparedStatement statement = con.prepareStatement("select * from CLIENTE where codice = '1'");
            
            //altre istruzioni sotto

            //Creating Variable to execute query
            ResultSet result = statement.executeQuery();

            while(result.next()){
                System.out.println(result.getString(2));
            }
      
            con.commit();
            statement.close();
            con.close();

     }catch (Exception e) {
         
        e.printStackTrace();
     }
      
    }
    
}









//PreparedStatement statement= con.prepareStatement("insert into CLIENTE (codice, nome, cognome) values (2,'Margherita','Demichelis')");

//String var_sql_cmd = "insert into CLIENTE (codice, nome, cognome) values (2,'Margherita','Demichelis')";
//PreparedStatement statement= con.prepareStatement(var_sql_cmd);


//String var_sql_cmd = "metododatabase(2,'Margherita','Demichelis')";
//PreparedStatement statement= con.prepareStatement(var_sql_cmd);
