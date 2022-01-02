/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Luis Rodriguez
 */
public class Conexion {
     Connection conect = null;
  
    public Connection conexion(){
        try {   
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conect = DriverManager.getConnection("jdbc:mysql://localhost/personas","root","");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error"+e);
        }
  return conect;
    }
}

//org.gjt.mm.mysql.Driver