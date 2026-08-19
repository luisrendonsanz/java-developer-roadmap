package PaymentSystem;

public class PagoTarjeta extends MetodoPago{
    public PagoTarjeta(double monto) {
        super(monto);
    }
    @Override
    public void procesarPago() {
        System.out.println("Pagando $"+monto+" con tarjeta");
    }
}
