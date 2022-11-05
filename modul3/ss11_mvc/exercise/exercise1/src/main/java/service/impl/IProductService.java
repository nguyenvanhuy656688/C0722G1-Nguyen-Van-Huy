package service.impl;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findByName(String name);

    void update(String name, String price);

    Product findById(int id);

    void delete(String name);

    void add(Product product);
}
