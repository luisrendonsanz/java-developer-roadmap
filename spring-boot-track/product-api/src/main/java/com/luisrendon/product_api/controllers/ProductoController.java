package com.luisrendon.product_api.controllers;

import com.luisrendon.product_api.dto.ProductRequestDto;
import com.luisrendon.product_api.dto.ProductDtoResponse;
import com.luisrendon.product_api.services.ProductService;
import jakarta.validation.Valid;
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
    public ProductDtoResponse devolverUnProducto() {
        return productService.getAllProducts().getFirst(); // en este caso devolvermos el primer producto
    }

    @GetMapping("/api/productos")
    public List<ProductDtoResponse> obtenerProductos() {
        return productService.getAllProducts();
    }

    @GetMapping("/api/productos/{id}")
    public ResponseEntity<ProductDtoResponse> obtenerProducto(@PathVariable Long id) {
        ProductDtoResponse producto = productService.buscarPorId(id);
        if (producto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(producto);
    }

    @GetMapping("/api/productos/precio")
    public ResponseEntity<List<ProductDtoResponse>> productosCondicion(@RequestParam double precio) {
        List<ProductDtoResponse> productos = productService.productoFiltrado(precio);
        return ResponseEntity.ok(productos);
    }

    @PostMapping("/api/productos")
    public ResponseEntity<ProductRequestDto> agregarNuevoProducto(@Valid @RequestBody ProductRequestDto nuevoProducto) {
        ProductRequestDto productoCreado = productService.nuevoProducto(nuevoProducto);
        if (productoCreado == null) {
            return ResponseEntity.badRequest().body(nuevoProducto);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(productoCreado);
    }

    @PutMapping("/api/productos/{id}")
    public ResponseEntity<ProductDtoResponse> actualizarProducto(
            @PathVariable Long id,
            @RequestBody ProductRequestDto updateProducto) {
        ProductDtoResponse productoActualizar = productService.updateProducto(id, updateProducto);
        if (productoActualizar == null) {
            ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(productoActualizar);
    }

    @DeleteMapping("api/productos/{id}")
    public ResponseEntity<ProductDtoResponse> eliminarProducto(@PathVariable Long id) {
        ProductDtoResponse productoEliminar = productService.deleteProducto(id);
        if (productoEliminar == null) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(productoEliminar);
    }

}
