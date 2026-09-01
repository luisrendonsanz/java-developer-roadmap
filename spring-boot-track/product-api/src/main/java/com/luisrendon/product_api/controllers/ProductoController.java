package com.luisrendon.product_api.controllers;

import com.luisrendon.product_api.models.Producto;
import com.luisrendon.product_api.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class ProductoController {
    private final ProductService productService;

    public ProductoController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/productos/demo")
    public Producto devolverUnProducto() {
        return productService.mostrarProductos().getFirst(); // en este caso devolvermos el primer producto
    }

    @GetMapping("/api/productos")
    public List<Producto> obtenerProductos() {
        return productService.mostrarProductos();
    }

    @GetMapping("/api/productos/{id}")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable Long id) {
        Producto producto = productService.buscarPorId(id);
        if (producto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(producto);
    }

    @GetMapping("/api/productos/precio")
    public ResponseEntity<List<Producto>> productosCondicion(@RequestParam double precio) {
        List<Producto> producto = productService.productoFiltrado(precio);
        return ResponseEntity.ok(producto);
    }

    @PostMapping("/api/productos")
    public ResponseEntity<Producto> agregarNuevoProducto(@RequestBody Producto nuevoProducto) {
        Producto productoCreado = productService.nuevoProducto(nuevoProducto);
        if (productoCreado == null) {
            return ResponseEntity.badRequest().body(nuevoProducto);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(productoCreado);
    }

    @PutMapping("/api/productos/{id}")
    public ResponseEntity<Producto> actualizarProducto(
            @PathVariable Long id,
            @RequestBody Producto updateProducto) {
        Producto productoActualizar = productService.updateProducto(id, updateProducto);
        if (productoActualizar == null) {
            ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(productoActualizar);
    }

    @DeleteMapping("api/productos/{id}")
    public ResponseEntity<Producto> eliminarProducto(@PathVariable Long id) {
        Producto productoEliminar = productService.deleteProducto(id);
        if (productoEliminar == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(productoEliminar);
    }

}
