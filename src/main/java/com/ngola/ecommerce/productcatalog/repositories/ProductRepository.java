package com.ngola.ecommerce.productcatalog.repositories;

import com.ngola.ecommerce.productcatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
