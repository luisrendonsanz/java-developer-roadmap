package ProductCustomerManager;

public class Producto implements Comparable<Producto> {
    private double precio;
    private int id;
    private String nombre;
    private int stock;
    private int stockBajo = 30;


    public Producto(int stock, String nombre, double precio) {
        if (stock <= 0) {
            throw new IllegalArgumentException("no puedes agregar un stock vario o en 0");
        }
        this.stock = stock;
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("no puedes agregar un producto sin nombre");
        }
        this.nombre = nombre;
        if (precio <= 0) {
            throw new IllegalArgumentException("no puedes agregar un precio negativo o en 0");
        }
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockBajo() {
        return stockBajo;
    }

    @Override
    public String toString() {
        return "Producto-> " + "\nstock= " + stock +
                "\nnombre= " + nombre +
                "\nid= " + id +
                "\nprecio= " + precio;
    }

    @Override
    public int compareTo(Producto o) {
        return Double.compare(this.getPrecio(), o.getPrecio());
    }

}
