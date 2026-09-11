package com.luisrendon.product_api.Exception;

public class ProductoNoEncontradoException extends RuntimeException {

    public ProductoNoEncontradoException(Long id) {
        super("Producto con el id: " + id + " no encontrado");
    }
}
