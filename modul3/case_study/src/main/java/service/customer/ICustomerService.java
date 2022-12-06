package service.customer;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> displayAll();

    boolean create(Customer customer);

    Customer editById(int id);

    boolean edit(Customer customer);

    List<Customer> search(int id,String name,String address);

    boolean delete(int id);
}
