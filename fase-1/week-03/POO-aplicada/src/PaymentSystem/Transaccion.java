package PaymentSystem;

public class Transaccion {
    public static void main(String[] args) {
        MetodoPago efectivo = new PagoEfectivo(2000);
        MetodoPago transferencia = new PagoTransferencia(1900);
        MetodoPago tarjeta = new PagoTarjeta(199);

        efectivo.procesarPago();
        transferencia.procesarPago();
        tarjeta.procesarPago();

    }
}
