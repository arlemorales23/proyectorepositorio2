/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;
import java.io.*;
import java.util.ArrayList;
public class LeeProductos {
private static int cont = 0;
private static File archivo;
private static FileReader fr;
private static BufferedReader br;
static ArrayList <Producto> productos =
new ArrayList<Producto>();
public static ArrayList <Producto> leeProductos(String path){
try {
archivo = new File(path);
fr = new FileReader(archivo);
br = new BufferedReader(fr);
String linea=null;
String [] tokensLinea = null;
int clave;
String nombre;
Double precio;
int cant;
Producto producto;
linea=br.readLine();
while( linea!=null){
tokensLinea = linea.split(",");
clave= Integer.parseInt(tokensLinea[0]);
nombre =tokensLinea[1];
precio= Double.parseDouble(tokensLinea[2]);
cant = Integer.parseInt(tokensLinea[3]);
producto = new Producto(clave,nombre, precio, cant);
productos.add(producto);
cont++;
linea=br.readLine();
}
}catch(IOException | NumberFormatException e){
}finally{
try{
if( null != fr )
fr.close();
}catch (IOException e2){
}
}
return productos;
}
public static int getCont(){
return cont;
}
public static void clearCont(){
cont=0;
}
}