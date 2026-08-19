package PaymentSystem;

public abstract class MetodoPago {

    protected double monto;

    public MetodoPago(double monto) {
        if (monto<0){
            System.out.println("No puedes agregar un monto negativo");
            return;
        }
        this.monto = monto;
    }

    public abstract void procesarPago();
}
