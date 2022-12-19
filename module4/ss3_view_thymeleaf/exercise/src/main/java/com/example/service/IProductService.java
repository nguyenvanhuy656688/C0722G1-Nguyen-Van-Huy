package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> list();

    Object deleteById(int id);

    Object showById(int id);

    void save(Product product);

    Object editById(int id,Product product);

}
