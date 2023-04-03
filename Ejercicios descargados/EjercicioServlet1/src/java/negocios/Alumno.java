/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

/**
 *
 * @author USUARIO
 */
public class Alumno {
      private String nombre;
      private String apellidos;
      private Double promedio;
      
      public Alumno(String nombre, String apellidos,Double promedio){
            this.nombre=nombre;
            this.apellidos=apellidos;
            this.promedio=promedio;        
      }
      
     public String getNombre(){
           return  nombre;
     }
     
     public String getApellidos(){
           return apellidos;
     }
     
      public Double getPromedio(){
            return promedio;
      }
      
      @Override
      public String toString(){
            return(nombre+""+apellidos+"promedio"+promedio);
      }
}
