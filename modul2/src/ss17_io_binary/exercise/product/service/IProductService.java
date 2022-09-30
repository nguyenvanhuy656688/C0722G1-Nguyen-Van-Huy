package ss17_io_binary.exercise.product.service;

import java.io.IOException;

public interface IProductService {
    void addProduct() throws IOException;

    void display() throws IOException;

    void remove();

    void find();
}
