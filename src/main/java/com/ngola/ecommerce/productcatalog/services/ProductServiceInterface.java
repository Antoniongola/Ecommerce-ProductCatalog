package com.ngola.ecommerce.productcatalog.services;

import com.ngola.ecommerce.productcatalog.entities.Product;

import java.util.List;

public interface ProductServiceInterface {
    public Product getProductById(long id);
    public List<Product> getAllProducts();
    public boolean addProduct(Product product);
    public boolean updateProduct(long id, Product product);
    public boolean deleteProduct(long id);
    public List<Product> findProductByName(String productName);
}
