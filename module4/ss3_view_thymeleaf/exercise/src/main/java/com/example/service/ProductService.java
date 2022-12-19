package com.example.service;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static Map<Integer,Product> productMap = new LinkedHashMap<>();

    static {
        productMap.put(1,new Product(1,"Mouse",100,"logitech"));
        productMap.put(2,new Product(2,"Card",200,"NVDA"));
        productMap.put(3,new Product(3,"Ram",100,"Gskill"));
        productMap.put(4,new Product(4,"Chip",100,"Intel"));
    }
    @Override
    public List<Product> list() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Object deleteById(int id) {
        return productMap.remove(id);
    }

    @Override
    public Object showById(int id) {
        return productMap.get(id);
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public Object editById(int id,Product product) {
        return productMap.put(id,product);
    }

}
