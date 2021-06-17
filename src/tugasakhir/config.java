/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author mainw
 */
public class config {
     private static Connection con;
        public static Connection configDB() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/mahasiswa_sakti";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(url,user,pass);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
}
