package service.impl;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    List<Product> findByName(String name);

    void update(String name, Product product);

    void delete(String name);

    void add(Product product);

    Product findByName1(String name);
}
