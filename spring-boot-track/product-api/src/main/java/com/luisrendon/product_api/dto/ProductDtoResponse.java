package com.luisrendon.product_api.dto;

public class ProductDtoResponse {
    final private Long id;
    final private String nombre;
    final private double precio;
    final private int stock;

    public ProductDtoResponse(Long id, String nombre, double precio, int stock) {
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
}
