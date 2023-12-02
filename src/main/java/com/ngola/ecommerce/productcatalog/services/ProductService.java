package com.ngola.ecommerce.productcatalog.services;

import com.ngola.ecommerce.productcatalog.entities.Product;
import com.ngola.ecommerce.productcatalog.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductServiceInterface{
    @Autowired
    private ProductRepository productRepository;

    public Product getProductById(long id){
        if(this.productRepository.findById(id).isPresent()){
            return this.productRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public boolean addProduct(Product product) {
        if(product != null){
            this.productRepository.save(product);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateProduct(long id, Product product) {
        if(product != null){
            this.productRepository.save(product);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteProduct(long id) {
        if(this.productRepository.findById(id).isPresent()){
            this.productRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Product> findProductByName(String productName) {
        return this.productRepository.findByNameContainingIgnoreCase(productName);
    }
}
