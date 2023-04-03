/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.ConectaDB;

public class GestorBD {
public boolean registrar(int clave, String nombre, Double precio, int cant) {
            Connection conn = null;
            Statement stm;
            ResultSet rs;
            int resultUpdate = 0;
try{
                  Connection conn=  Conexion.Conectar();
                  stm = conn.createStatement();
                  resultUpdate = stm.executeUpdate("insert into productos values("
if(resultUpdate != 0){

return true;
                  +clave+",'" + nombre + "'," +precio+","+cant+ ");");
}else{

return false;
}
}catch (SQLException e) {

return false;
}
}
}
