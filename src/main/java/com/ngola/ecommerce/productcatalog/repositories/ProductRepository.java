package com.ngola.ecommerce.productcatalog.repositories;

import com.ngola.ecommerce.productcatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByNameContainingIgnoreCase(String productName);
}
