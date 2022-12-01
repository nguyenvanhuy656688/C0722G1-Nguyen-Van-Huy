package repository.impl;

import model.Product;

import java.util.List;

public interface IProductRepository {


    
    List<Product> displayAll();

    Product searchByName(String name);

    void displayAEdit(int id);

    boolean edit(int id,Product product);

    void deleteByName(String name);

    boolean create(int id,Product product);
}
