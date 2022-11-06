package repository.impl;

import model.Product;

import java.util.List;

public interface IProductRepository {
    void delete(String name);

    List<Product> finByName(String name);

    List<Product> displayList();

    void edit(String name, Product product);

    void add(Product product);

    Product finByName1(String name);
}
