package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {
    Product findById(int id);

    List<Product> findAll();
}
