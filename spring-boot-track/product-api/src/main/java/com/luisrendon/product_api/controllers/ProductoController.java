package com.luisrendon.product_api.controllers;

import com.luisrendon.product_api.dto.ProductRequestDto;
import com.luisrendon.product_api.dto.ProductDtoResponse;
import com.luisrendon.product_api.services.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
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
    public ProductDtoResponse obtenerProducto(@PathVariable Long id) {
        return productService.buscarPorId(id);
    }

    @GetMapping("/api/productos/precio")
    public List<ProductDtoResponse> productosCondicion(@RequestParam double precio) {
        return productService.productoFiltrado(precio);
    }

    @PostMapping("/api/productos")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductRequestDto agregarNuevoProducto(@Valid @RequestBody ProductRequestDto nuevoProducto) {
        return productService.nuevoProducto(nuevoProducto);
    }

    @PutMapping("/api/productos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductDtoResponse actualizarProducto(
            @PathVariable Long id,
            @Valid @RequestBody ProductRequestDto updateProducto) {
        return productService.updateProducto(id, updateProducto);
    }

    @DeleteMapping("api/productos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductDtoResponse eliminarProducto(@PathVariable Long id) {
        return productService.deleteProducto(id);
    }

}
