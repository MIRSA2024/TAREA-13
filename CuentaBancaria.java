package tarea13;
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    // Método get para saldo
    public double getSaldo() {
        return saldo;
    }

    // Método set para saldo
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depositado: " + monto);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retirado: " + monto);
        } else {
            System.out.println("Saldo insuficiente o monto inválido.");
        }
    }
    public void mostrarCuenta() {
        System.out.println("Número de cuenta: " + numeroCuenta + ", Saldo: " + saldo);
    }
}


