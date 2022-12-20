package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> list();

    void save(Product product);

    void editById( Product product);

    Product findById(int id);

    Product deleteById(int id);

    List<Product> searchByPrice(String name);

}
