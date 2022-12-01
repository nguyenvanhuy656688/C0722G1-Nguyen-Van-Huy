package service.impl;

import model.Product;
import repository.impl.IProductRepository;
import repository.impl.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    IProductRepository iProductRepository = new ProductRepository();


    @Override
    public void deleteByName(String name) {
        iProductRepository.deleteByName(name);
    }

    @Override
    public List<Product> displayAll() {
        return iProductRepository.displayAll();
    }

    @Override
    public Product searchByName(String name) {
        return iProductRepository.searchByName(name);
    }

    @Override
    public void displayAEdit(int id) {
        iProductRepository.displayAEdit(id);

    }

    @Override
    public boolean edit(int id,Product product) {
        return iProductRepository.edit(id,product);
    }

    @Override
    public boolean create(int id,Product product) {
        return iProductRepository.create(id,product);
    }
}
