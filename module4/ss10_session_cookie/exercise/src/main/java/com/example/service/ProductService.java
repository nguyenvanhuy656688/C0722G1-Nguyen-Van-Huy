package com.example.service;

import com.example.model.Product;
import com.example.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;


    public Product findById(int id) {
        return iProductRepository.findById(id).orElse(null);
    }
}
