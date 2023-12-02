package com.ngola.ecommerce.productcatalog.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="produto")
@Table(name="produto")
public class Product {
    @Id
    private long id;
    private String name;
    private String description;
    private String image;
}
