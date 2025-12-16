package com.example.backend.product.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private double price;

    private String imageUrl; // store image URL

    private String category; // e.g., Men, Women, Accessories
    
    private String size;    // NEW

    private String color;   // NEW
    
}
