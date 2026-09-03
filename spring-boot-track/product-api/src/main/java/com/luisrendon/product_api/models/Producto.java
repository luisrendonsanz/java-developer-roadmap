package com.luisrendon.product_api.models;


import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(){

    }

    public Producto(Long id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que 0, recibido: " + precio);
        }
        this.precio = precio;
    }
    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo recibido: " + stock);
        }
        this.stock = stock;
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
