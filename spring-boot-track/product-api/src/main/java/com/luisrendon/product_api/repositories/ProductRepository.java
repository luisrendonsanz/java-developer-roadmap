package com.luisrendon.product_api.repositories;

import com.luisrendon.product_api.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Producto, Long> {

}
