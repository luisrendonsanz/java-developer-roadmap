package POO_esencial.Producto;

public class Main {
    public static void main(String[] args) {
        var producto1 = new Producto("Laptop",560,5);
        producto1.aumentarStock(10);
        producto1.vender(20);
        producto1.vender(10);
        producto1.calcularValorTotal();
    }
}
