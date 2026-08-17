package POO_esencial.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        var cuenta1 = new CuentaBancaria(100);
        System.out.println(cuenta1.consultarSaldo());
        cuenta1.depositar(1000);
        System.out.println(cuenta1.consultarSaldo());
        cuenta1.retirar(100);
    }
}
