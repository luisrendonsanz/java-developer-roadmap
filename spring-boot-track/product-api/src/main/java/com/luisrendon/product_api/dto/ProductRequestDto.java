package com.luisrendon.product_api.dto;

import jakarta.validation.constraints.*;

public class ProductRequestDto {
    @NotBlank
    final String nombre;
    @PositiveOrZero
    final double precio;
    @PositiveOrZero
    final int stock;

    public ProductRequestDto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
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
