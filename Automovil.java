package tarea13;
public class Automovil {
    private String modelo;
    private String color;
    private double velocidadMaxima;
    private boolean motorEncendido;

    // Constructor
    public Automovil(String modelo, String color, double velocidadMaxima) {
        this.modelo = modelo;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
        this.motorEncendido = false; 
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método get para color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    // Método set para velocidadMaxima
    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("La velocidad máxima debe ser positiva.");
        }
    }
    public void encenderMotor() {
        if (!motorEncendido) {
            motorEncendido = true;
            System.out.println("El motor está encendido.");
        } else {
            System.out.println("El motor ya está encendido.");
        }
    }
    public void apagarMotor() {
        if (motorEncendido) {
            motorEncendido = false;
            System.out.println("El motor está apagado.");
        } else {
            System.out.println("El motor ya está apagado.");
        }
    }
    public void mostrarAutomovil() {
        System.out.println("Automóvil modelo: " + modelo + ", Color: " + color + ", Velocidad máxima: " + velocidadMaxima + " km/h.");
    }
}
