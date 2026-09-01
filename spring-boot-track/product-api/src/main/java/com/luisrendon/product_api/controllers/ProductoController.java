package com.luisrendon.product_api.controllers;

import com.luisrendon.product_api.models.Producto;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductoController {
    private List<Producto> productos = new ArrayList<>();

    @PostConstruct
    public void generarProductos() {
        productos.add(new Producto(1L, "Laptop", 452.00, 10));
        productos.add(new Producto(2L, "Mouse", 200.50, 12));
        productos.add(new Producto(3L, "Pc", 301.42, 23));
        productos.add(new Producto(4L, "Libreta", 123.32, 41));
    }

    @GetMapping("/api/productos/demo")
    public Producto devolverUnProducto() {
        return productos.getFirst(); // en este caso devolvermos el primer producto
    }

    @GetMapping("/api/productos")
    public List<Producto> helloWorld() {
        return productos;
    }

    @GetMapping("/api/productos/{id}")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable Long id) {
        Producto productoEncontrado = null;
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                productoEncontrado = producto;
                break;
            }
        }
        if (productoEncontrado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(productoEncontrado);
    }

    @GetMapping("/api/productos/precio")
    public List<Producto> productosCondicion(@RequestParam double min) {
        List<Producto> productosFiltrados = productos.stream()
                .filter(n -> n.getPrecio() >= min)
                .toList();
        return productosFiltrados;
    }

    @PostMapping("/api/productos")
    public ResponseEntity<Producto> agregarNuevoProducto(@RequestBody Producto nuevoProducto) {
        if (nuevoProducto.getStock() < 0 || nuevoProducto.getPrecio() < 0) {
            return ResponseEntity.badRequest().build();
        }
        Long nuevoId = productos.stream().mapToLong(Producto::getId).max().orElse(0) + 1;
        Producto productoCreado = new Producto(nuevoId,nuevoProducto.getNombre(),nuevoProducto.getPrecio(),nuevoProducto.getStock());
        productos.add(productoCreado);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoCreado);
    }

}
