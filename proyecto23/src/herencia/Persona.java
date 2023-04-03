package herencia;

public class Persona {
    protected String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarMensaje(){
        System.out.println("hola, saludos");
    }
}

class Empleado3 extends Persona{
 public float salario;
 public void mostrarMensaje(){
     System.out.println("estamos en programacion");
 }
}
