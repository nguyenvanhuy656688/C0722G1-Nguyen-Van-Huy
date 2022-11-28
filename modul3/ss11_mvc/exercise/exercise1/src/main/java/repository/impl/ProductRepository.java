package repository.impl;

import model.Product;

import java.util.*;

public class ProductRepository implements IProductRepository {
     static Map<Integer,Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Kẹo", 8.0, "Ngon","mikita"));
        products.put(2, new Product(2, "Bánh", 8.0, "Ngon","mikita"));
        products.put(3, new Product(3, "Kem", 8.0, "Ngon","mikita"));
        products.put(4, new Product(4, "Nước", 8.0, "Ngon","mikita"));
    }

    @Override
    public List<Product> displayAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product searchByName(String name) {
        return  products.get(name);
    }

    @Override
    public void displayAEdit(int id) {
        products.values();

    }

    @Override
    public boolean edit(int id,Product product) {
        products.put(id,product);
        return true;
    }

    @Override
    public void deleteByName(String name) {
        products.remove(name);
    }

    @Override
    public boolean create(int id,Product product) {
        products.put(id,product);
        return true;
    }
}
