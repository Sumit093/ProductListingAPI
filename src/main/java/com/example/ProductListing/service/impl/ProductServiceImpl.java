package com.example.ProductListing.service.impl;

import com.example.ProductListing.model.Product;
import com.example.ProductListing.repository.ProductRepo;
import com.example.ProductListing.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepository;

    @Override
    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id){
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public Page<Product> getAllProducts(int page, int size){
        return productRepository.findAll(PageRequest.of(page, size));
    }

    @Override
    public Product updateProduct(Long id, Product updatedProduct){
        Product existing = getProductById(id);

        existing.setProductName(updatedProduct.getProductName());
        existing.setModifiedBy(updatedProduct.getModifiedBy());

        return productRepository.save(existing);
    }

    @Override
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}