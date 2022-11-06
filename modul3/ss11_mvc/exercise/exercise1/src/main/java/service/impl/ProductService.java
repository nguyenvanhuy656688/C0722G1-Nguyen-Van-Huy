package service.impl;

import model.Product;
import repository.impl.IProductRepository;
import repository.impl.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    IProductRepository iProductRepository = new  ProductRepository();
    @Override
    public List<Product> findAll() {
        return iProductRepository.displayList();
    }

    @Override
    public List<Product> findByName(String name) {
         return iProductRepository.finByName(name);
    }

    @Override
    public void update(String name, Product product) {
        iProductRepository.edit(name,product);

    }


    @Override
    public void delete(String name) {
        iProductRepository.delete( name);

    }

    @Override
    public void add(Product product) {
        iProductRepository.add(product);

    }

    @Override
    public Product findByName1(String name) {
        return iProductRepository.finByName1(name);
    }
}
