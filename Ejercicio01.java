
package tarea13;
import java.util.Date;

public class Ejercicio01 {
    
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan Pérez", 3000.00, new Date());
        empleado.mostrarEmpleado();
        empleado.setSalario(3500.00);
        empleado.mostrarEmpleado();
    }
}
    
