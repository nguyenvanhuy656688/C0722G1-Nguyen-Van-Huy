package ss19_string_regax.exercise.mvc_product.Service;

import java.io.IOException;

public interface IProductService {
    void addProduct() throws IOException;

    void display() throws IOException;

    void remove() throws IOException;

    void find() throws IOException;
}
