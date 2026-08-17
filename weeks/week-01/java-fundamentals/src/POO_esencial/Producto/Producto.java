package POO_esencial.Producto;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (precio < 0) {
            throw new IllegalArgumentException("El precin no puede ser negativo");
        }
        if (stock <0 ) {
            throw new IllegalArgumentException("El stock inicial no puede ser negativo");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void aumentarStock(int aumentoStock){
        if (aumentoStock<=0){
            throw new IllegalArgumentException("El aumento de stock debe ser mayor a 0");
        }
        stock+=aumentoStock;
    }
    public void vender(int venta){
        System.out.println("Stock actual: " +stock);
        if(venta>stock){
            System.out.println("No puedes vender mas del stock actual del producto");
        } else if (venta<=0) {
            throw new IllegalArgumentException("La venta debe ser mayor a 0");
        } else {
            System.out.println("Stock del producto modificado");
            stock-=venta;
            System.out.println("Nuevo stock del producto: "+stock);
        }
    }
    public void calcularValorTotal(){
        double valorTotal = stock*precio;
        System.out.println(valorTotal);
    }
}
