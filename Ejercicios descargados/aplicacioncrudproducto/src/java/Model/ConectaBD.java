/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConectaBD {
      public static Connection con;
      private static String bd = "agenda";
      public static String usuario = "root";
      public static String passw = "";
      public static String url = "jdbc:mysql://localhost:3306/agenda";
      public static Connection abrir(){
try{
      Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection(url,usuario,passw);
      } catch (ClassNotFoundException | SQLException e) {
                  System.out.println("Error en la conexion...");
}
return con;
}
public static void cerrar(){
      try{
      if(con != null)
                    con.close();
      } catch (SQLException e){
                   System.out.println("Error: No se logro cerrar conexion:\n"+e);
      }
      }
}