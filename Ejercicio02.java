
package tarea13;

public class Ejercicio02 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("1234567890", 5000.00);

        cuenta.mostrarCuenta();

        cuenta.depositar(1000.00);

        cuenta.retirar(500.00);

        cuenta.mostrarCuenta();
    }
}


