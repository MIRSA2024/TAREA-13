
package tarea13;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear un automóvil
        Automovil auto = new Automovil("Toyota Corolla", "Blanco", 180);

        // Mostrar la información del automóvil
        auto.mostrarAutomovil();

        // Encender el motor
        auto.encenderMotor();

        // Apagar el motor
        auto.apagarMotor();

        // Cambiar la velocidad máxima
        auto.setVelocidadMaxima(200);
        auto.mostrarAutomovil();
    }
}

