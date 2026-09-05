package com.luisrendon.product_api.services;

import com.luisrendon.product_api.dto.ProductRequestDto;
import com.luisrendon.product_api.dto.ProductDtoResponse;
import com.luisrendon.product_api.models.Producto;
import com.luisrendon.product_api.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDtoResponse> getAllProducts() {
        List<Producto> productos = productRepository.findAll();
        List<ProductDtoResponse> productResponses = new ArrayList<>();
        for (Producto producto : productos) {
            productResponses.add(convertirEnRespuesta(producto));
        }
        return productResponses;
    }

    public ProductDtoResponse buscarPorId(Long id) {
        Producto producto = productRepository.findById(id).orElse(null);
        if (producto != null) {
            return convertirEnRespuesta(producto);
        }
        return null;
    }

    public ProductRequestDto nuevoProducto(ProductRequestDto nuevoProducto) {
        if (nuevoProducto.getStock() < 0 || nuevoProducto.getPrecio() < 0) {
            return null;
        }
        Producto producto = convertirAentidad(nuevoProducto);
        Producto guardado = productRepository.save(producto);
        return convertirADto(guardado);
    }

    public List<ProductDtoResponse> productoFiltrado(double precio) {
        List<ProductDtoResponse> productoList = getAllProducts();
        return productoList.stream().filter(n -> n.getPrecio() >= precio).toList();
    }

    public ProductDtoResponse updateProducto(Long id, ProductRequestDto updateProducto) {
        Producto producto = productRepository.findById(id).orElse(null);
        if (producto != null) {
            producto.setNombre(updateProducto.getNombre());
            producto.setStock(updateProducto.getStock());
            producto.setPrecio(updateProducto.getPrecio());
            Producto productoActualizado = productRepository.save(producto);
            return convertirEnRespuesta(productoActualizado);
        }
        return null;

    }

    public ProductDtoResponse deleteProducto(Long id) {
        Producto productoEliminado = productRepository.findById(id).orElse(null);
        productRepository.deleteById(id);
        if (productoEliminado != null) {
            return convertirEnRespuesta(productoEliminado);
        }
        return null;
    }

    private ProductRequestDto convertirADto(Producto producto) {
        return new ProductRequestDto(producto.getNombre(), producto.getPrecio(), producto.getStock());
    }

    public ProductDtoResponse convertirEnRespuesta(Producto producto) {
        return new ProductDtoResponse(producto.getId(), producto.getNombre(), producto.getPrecio(), producto.getStock());
    }

    private Producto convertirAentidad(ProductRequestDto dto) {
        Producto producto = new Producto();
        producto.setNombre(dto.getNombre());
        producto.setPrecio(dto.getPrecio());
        producto.setStock(dto.getStock());
        return producto;
    }
}
