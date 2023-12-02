package com.ngola.ecommerce.productcatalog.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name="produto")
@Table(name="produto")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private double price;
    private String description;
    private String image;
}
