package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> list();

    Product deleteById(int id);

    Product showById(int id);

    void save(Product product);

    Product editById(int id,Product product);

}
