package ejercicio20;

public class Reparacion {
    private int numeroPitidos;
    private boolean girarDisco;

    public String validarReparacion(){
        if(numeroPitidos == 1 && girarDisco == false){
            return "ddd";
        }
        return "";
    }
}
