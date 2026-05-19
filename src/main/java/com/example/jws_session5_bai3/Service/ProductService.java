package com.example.jws_session5_bai3.Service;


import com.example.jws_session5_bai3.Entity.Product;
import com.example.jws_session5_bai3.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;


    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }

    public Product createProduct(Product product){
        product.setId(null);
        return productRepository.save(product);
    }
}
