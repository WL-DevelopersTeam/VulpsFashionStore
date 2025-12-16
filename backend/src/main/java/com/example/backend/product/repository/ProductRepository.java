package com.example.backend.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.backend.product.model.Product;

public interface ProductRepository extends JpaRepository<Product , Long>
{
    List<Product> findByCategory(String category);

    List<Product> findBySize(String size);

    List<Product> findByColor(String color);
}
