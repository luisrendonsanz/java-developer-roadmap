package com.luisrendon.product_api.services;

import com.luisrendon.product_api.models.Producto;
import com.luisrendon.product_api.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Producto> getAllProducts() {
        return productRepository.findAll();
    }

    public Producto buscarPorId(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Producto nuevoProducto(Producto nuevoProducto) {
        if (nuevoProducto.getStock() < 0 || nuevoProducto.getPrecio() < 0) {
            return null;
        }
        nuevoProducto.setId(null);
        return productRepository.save(nuevoProducto);
    }

    public List<Producto> productoFiltrado(double precio) {
        List<Producto> productoList = getAllProducts();
        return productoList.stream()
                .filter(n -> n.getPrecio() >= precio).toList();
    }

    public Producto updateProducto(Long id, Producto updateProducto) {
        for (Producto producto : getAllProducts()) {
            if (producto.getId().equals(id)) {
                producto.setPrecio(updateProducto.getPrecio());
                producto.setNombre(updateProducto.getNombre());
                producto.setStock(updateProducto.getStock());
                return producto;
            }
        }
        return null;
    }
    public Producto deleteProducto(Long id) {
        Producto productoEliminado = productRepository.findById(id).orElse(null);
        productRepository.deleteById(id);
        return productoEliminado;
    }
}
