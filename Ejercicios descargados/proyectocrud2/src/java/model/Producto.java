/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Producto {
      private int clave;
      private String nombre;
      private Double precio;
      private int cantidad;
      
public Producto(int clave, String nombre,Double precio,int cant){
      this.clave = clave;
      this.nombre = nombre;
      this.precio = precio;
      this.cantidad = cant;
}
public int getClave(){
return clave;
}
public String getNombre(){
return nombre;
}
public Double getPrecio(){
return precio;
}
public int getCantidad(){
return cantidad;
}
}
