package PaymentSystem;

public class PagoTransferencia extends MetodoPago{
    public PagoTransferencia(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        System.out.println("Pagando $"+monto+" con transferencia");
    }
}
