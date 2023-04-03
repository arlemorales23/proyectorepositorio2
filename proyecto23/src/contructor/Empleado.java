package contructor;

public class Empleado {
    public int cod;
    public String Nombre;

    @Override
    public String toString() {
        return "Empleado{" +
                "cod=" + cod +
                ", Nombre='" + Nombre + '\'' +
                '}';
    }

    public Empleado(int cod, String nombre) {
        this.cod = cod;
        Nombre = nombre;
    }

    public Empleado() {
        System.out.println("hola.. conectadome...");
    }

    public Empleado(String nombre) {
        Nombre = nombre;
        System.out.println("este es el contrcutor con un parametro");
    }
}
