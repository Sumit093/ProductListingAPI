package com.example.ProductListing.service;

import com.example.ProductListing.model.Product;
import org.springframework.data.domain.Page;

public interface ProductService {
    Product createProduct(Product product);
    Product getProductById(Long id);
    Page<Product> getAllProducts(int page, int size);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}