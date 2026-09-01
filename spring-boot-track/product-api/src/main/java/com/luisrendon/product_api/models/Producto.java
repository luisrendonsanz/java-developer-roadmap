package com.luisrendon.product_api.models;

public class Producto {
    private Long id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(Long id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Producto->" +
                "\nid=" + id +
                "\nnombre='" + nombre +
                "\nprecio=" + precio +
                "\nstock=" + stock;
    }
}
