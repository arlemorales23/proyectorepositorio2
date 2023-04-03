package empleadosfecha;

import java.time.LocalDate;
import java.time.ZoneId;

public class Empleado2 {
    private String nombre;
    private LocalDate fechaNacimiento;

    public Empleado2(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Empleado2() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Long calcularAnos(){
        LocalDate stop = LocalDate.now( ZoneId.of( "America/Bogota" ) );
        long years = java.time.temporal.ChronoUnit.YEARS.between( fechaNacimiento , stop );
        return years;
    }
}
