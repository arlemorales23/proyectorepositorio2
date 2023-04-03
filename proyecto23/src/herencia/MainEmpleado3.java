package herencia;

public class MainEmpleado3 {
    public static void main(String[] args) {
        Empleado3 empleado3 = new Empleado3();
        empleado3.setNombre("Diego");
        empleado3.salario = 120000;
        System.out.println(empleado3.getNombre() + empleado3.salario);
        empleado3.mostrarMensaje();
    }
}
