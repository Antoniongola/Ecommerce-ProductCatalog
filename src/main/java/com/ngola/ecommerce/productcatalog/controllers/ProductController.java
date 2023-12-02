package com.ngola.ecommerce.productcatalog.controllers;

import com.ngola.ecommerce.productcatalog.entities.Product;
import com.ngola.ecommerce.productcatalog.services.ProductService;
import com.ngola.ecommerce.productcatalog.services.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products/all")
    public List<Product> findAllProducts(){
        return this.productService.getAllProducts();
    }

    @GetMapping("/products/{productId}")
    public Product findById(@PathVariable long productId){
        return this.productService.getProductById(productId);
    }

    @PostMapping("/products/new")
    public boolean createProduct(@RequestBody Product product){
        return this.productService.addProduct(product);
    }

    @DeleteMapping("/products/{productId}/delete")
    public boolean deleteById(@PathVariable long productId){
        return this.productService.deleteProduct(productId);
    }

    @PutMapping("/products/{productId}/update")
    public boolean updateProduct(@PathVariable long productId, Product product ){
        return this.productService.updateProduct(productId, product);
    }

    @PostMapping("/products/search")
    public List<Product> searchProduct(String productName){
        return this.productService.findProductByName(productName);
    }

}
