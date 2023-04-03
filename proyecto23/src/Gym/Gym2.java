package Gym;

public class Gym2 {
    private String nombreCliente;
    private int dias;
    private int valorDia15;
    private int valorDia30;
    private int valorDia90;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getValorDia15() {
        return valorDia15;
    }

    public void setValorDia15(int valorDia15) {
        this.valorDia15 = valorDia15;
    }

    public int getValorDia30() {
        return valorDia30;
    }

    public void setValorDia30(int valorDia30) {
        this.valorDia30 = valorDia30;
    }

    public int getValorDia90() {
        return valorDia90;
    }

    public void setValorDia90(int valorDia90) {
        this.valorDia90 = valorDia90;
    }

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
