package POO_esencial.CuentaBancaria;


public class CuentaBancaria {
    private double saldo = 0;

    public CuentaBancaria(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser menor a 0");
        }
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        if (deposito <= 0) {
            throw new IllegalArgumentException("El deposito debe ser mayor a 0");
        }
        saldo += deposito;
    }

    public void retirar(double retiro) {
        System.out.println("Saldo actual: " + saldo);
        if (retiro > saldo) {
            System.out.println("No puedes retirar mas del saldo que tienes");
        } else if (retiro < 0) {
            System.out.println("No puedes retirar un saldo negativo");
        } else {
            System.out.println("Retiro bien hecho");
            saldo -= retiro;
            System.out.println("Nuevo saldo: " + saldo);
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}
