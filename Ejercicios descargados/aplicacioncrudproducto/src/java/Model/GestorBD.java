package Model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestorBD {
      private Connection conn;
      public boolean registrar(int clave, String nombre, Double precio, int cant) {
                              Connection conn = null;
                              Statement stm;
                              ResultSet rs;
                              int resultUpdate = 0;
            try{
            conn = ConectaBD.abrir();
            stm = conn.createStatement();
            resultUpdate = stm.executeUpdate("insert into productos values("+clave+",'" + nombre + "',"
                    + "" +precio+","+cant+ ");");
            if(resultUpdate != 0){
                        ConectaBD.cerrar();
                  return true;
            }else{
            ConectaBD.cerrar();
                         return false;
            }
            }catch (SQLException e) {
                        System.out.println("Error en la base de datos.");
                        return false;
}
}

public Producto consultar(int clave, String nombre){
                              Connection conn = null;
                              Statement stm;
                              ResultSet rs;
                              int producResSet = 0;      
      try{
      conn = ConectaBD.abrir();
      stm = conn.createStatement();
                                    ResultSet productResSet = stm.executeQuery("SELECT * FROM productos WHERE"
                                            + " clave='"+clave+"' "  + "and nombre='"+nombre+"'");
if(!productResSet.next()){
                  System.out.println(" No se encontro el registro");
                        ConectaBD.cerrar();
                        return null;
}else{
            System.out.println("Se encontró el registro");
            int clav = productResSet.getInt("clave");
            String nom = productResSet.getString("nombre");
            double precio = productResSet.getDouble("precio");
            int cant = productResSet.getInt("cantidad");
           
            Producto productHallado = new Producto(clav,nom,precio,cant);
            ConectaBD.cerrar();
return productHallado;
}
}catch(SQLException e){
            System.out.println("Error en la base de datos.");
return null;
}
}
public ArrayList<Producto> leerTodos(){
                               Connection conn = null;
                              Statement stm;
            ArrayList<Producto> productos = new ArrayList<Producto>();
try{
            conn = ConectaBD.abrir();
            stm = conn.createStatement();
                                     ResultSet productResSet = stm.executeQuery("select * from productos");
if(!productResSet.next()){
            System.out.println(" No se encontraron registros");
            ConectaBD.cerrar();
            return null;
}else{
do{
      int clav = productResSet.getInt("clave");
      String nom = productResSet.getString("nombre");
      double precio = productResSet.getDouble("precio");
      int cant = productResSet.getInt("cantidad");
      Producto productHallado = new Producto(clav,nom,precio,cant);
      productos.add(productHallado);
}while(productResSet.next());
ConectaBD.cerrar();
return productos;
}
}catch(SQLException e){
      System.out.println("Error en la base de datos.");
return null;
}
}
}
