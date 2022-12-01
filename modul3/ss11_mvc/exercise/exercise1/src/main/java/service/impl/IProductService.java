package service.impl;

import model.Product;

import java.util.List;

public interface IProductService {


    void deleteByName(String name);

    List<Product> displayAll();

    Product searchByName(String name);

    void displayAEdit(int id);

    boolean edit(int id,Product product);

    boolean create(int id,Product product);
}
