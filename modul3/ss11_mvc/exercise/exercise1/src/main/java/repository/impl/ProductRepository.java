package repository.impl;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository implements IProductRepository{
    private static Map<String,Product> productMap = new HashMap<>();

    static {
        productMap.put("1",new Product("Mac","20000000","mac os","VND","14.0 inch"));
        productMap.put("2",new Product("Tuf","20000000","Android","VND","15.6 inch"));
        productMap.put("3",new Product("Rog","20000000","Android","VND","15.6 inch"));
        productMap.put("4",new Product("Predator","20000000","Android","VND","15.6 inch"));
        productMap.put("5",new Product("LG gram","20000000","Android","VND","15.6 inch"));
        productMap.put("6",new Product("Legion","20000000","Android","VND","15.6 inch"));
    }

    @Override
    public void delete(String name) {
        productMap.remove(name);
    }

    @Override
    public List<Product> finByName(String name) {
        List<Product> products = new ArrayList<>();

        if (productMap.size() == 0){
            return  products;
        }

        for (Product product : productMap.values()){
            if(product.getName().equals(name)){
                products.add(product);
            }
        }
        return products;
    }

    @Override
    public List<Product> displayList() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void edit(String name, Product product) {
        productMap.put(name,product);

    }

    @Override
    public void add(Product product) {
        productMap.put(product.getName(),product);


    }

    @Override
        public Product finByName1(String name) {
        return productMap.get(name);

    }
}
