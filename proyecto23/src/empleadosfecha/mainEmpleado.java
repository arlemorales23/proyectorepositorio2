package empleadosfecha;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Scanner;

public class mainEmpleado {
    public static void main(String[] args) {
        Empleado2 empleado = new Empleado2();
        String fecha = JOptionPane.showInputDialog(null, "Ingrese fecha (yy-mm-dd");
        empleado.setFechaNacimiento(LocalDate.parse(fecha));
       JOptionPane.showMessageDialog(null,  empleado.calcularAnos() + " años ");

       // cargue por el constructor
        Empleado2 empleado2 = new Empleado2("Juan andres", LocalDate.parse(fecha));
        JOptionPane.showMessageDialog(null,  "señor " + empleado2.getNombre()+" "+  empleado.calcularAnos() + " años ");
    }
}
