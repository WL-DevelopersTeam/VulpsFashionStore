package com.example.backend.product.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ProductRequest 
{
    private String name;
    
    private String description;

    private double price;

    private String category;

    private MultipartFile image; // image file uploaded

    private String size;    

    private String color;
}
