package tarea13;
import java.util.Date;
public class Empleado {
    private String nombre;
    private double salario;
    private Date fechaContratacion;

    public Empleado(String nombre, double salario, Date fechaContratacion) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario debe ser positivo.");
        }
    }
    public Date getFechaContratacion() {
        return fechaContratacion;
    }
    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    public void mostrarEmpleado() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario + ", Fecha de contratación: " + fechaContratacion);
    }
}

