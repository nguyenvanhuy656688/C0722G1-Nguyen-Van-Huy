package ss19_string_regax.exercise.mvc_product.Service;

import ss19_string_regax.exercise.mvc_product.utils.ProductException;

import java.io.IOException;

public interface IProductService {
    void addProduct() throws IOException, ProductException;

    void display() throws IOException;

    void remove() throws IOException;

    void find() throws IOException;
}
