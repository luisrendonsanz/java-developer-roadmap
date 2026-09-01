package com.luisrendon.product_api.services;

import com.luisrendon.product_api.models.Producto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Producto> productos = new ArrayList<>();

    @PostConstruct
    public void generarProductos() {
        productos.add(new Producto(1L, "Laptop", 452.00, 10));
        productos.add(new Producto(2L, "Mouse", 200.50, 12));
        productos.add(new Producto(3L, "Pc", 301.42, 23));
        productos.add(new Producto(4L, "Libreta", 123.32, 41));
    }

    public List<Producto> mostrarProductos() {
        return productos;
    }

    public Producto buscarPorId(Long id) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;
    }

    public Producto nuevoProducto(Producto nuevoProducto) {
        if (nuevoProducto.getStock() < 0 || nuevoProducto.getPrecio() < 0) {
            return null;
        }
        Long nuevoId = productos.stream().mapToLong(Producto::getId).max().orElse(0) + 1;
        Producto productoCreado = new Producto(nuevoId, nuevoProducto.getNombre(), nuevoProducto.getPrecio(), nuevoProducto.getStock());
        productos.add(productoCreado);
        return productoCreado;
    }

    public List<Producto> productoFiltrado(double precio) {
        return productos.stream()
                .filter(n -> n.getPrecio() >= precio).toList();
    }
}
