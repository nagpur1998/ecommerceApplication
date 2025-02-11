package com.example.productcatalogservice.services;

import com.example.productcatalogservice.models.Product;

import java.util.List;

public interface IProductService {
    public List<Product> getAllProducts();

    public Product getProductById(Long id);
    public Product createProduct(Product product);
}
