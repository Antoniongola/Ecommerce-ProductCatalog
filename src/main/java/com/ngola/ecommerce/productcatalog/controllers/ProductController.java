package com.ngola.ecommerce.productcatalog.controllers;

import com.ngola.ecommerce.productcatalog.services.ProductService;
import com.ngola.ecommerce.productcatalog.services.ProductServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @Get
}
