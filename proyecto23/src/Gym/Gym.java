package Gym;

public class Gym {
    public String nombreCliente;
    public int dias;
    public int valorDia15;
    public int valorDia30;
    public int valorDia90;
     public int costoMensualidad(){
         if(dias == 1){
             return valorDia15;
         }else if(dias == 2){
             return valorDia30;
         }else if(dias == 3){
             return valorDia90/3;
         }else{
             return 0;
         }
     }
}
