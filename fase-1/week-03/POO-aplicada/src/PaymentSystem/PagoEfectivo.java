package PaymentSystem;

public class PagoEfectivo extends MetodoPago {
    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        System.out.println("Pago de $"+monto+" con efectivo");
    }
}
