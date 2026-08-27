package com.luisrendon.product_api.controllers;

import com.luisrendon.product_api.models.Producto;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductoController {
    private List<Producto> productos;

    @PostConstruct
    public void generarProductos(){
        productos.add(new Producto(1,"Laptop",12.4,1));
        productos.add(new Producto(2 ,"Laptop",12.4,1));
        productos.add(new Producto(3,"Laptop",12.4,1));
        productos.add(new Producto(4,"Laptop",12.4,1));
    }
    @GetMapping("/api/productos/demo")
    public Producto devolverUnProducto(){
        return productos.getFirst(); // en este caso devolvermos el primer producto
    }

    @GetMapping("/api/productos")
    public List<Producto> helloWorld() {
        return productos;
    }

    





}
