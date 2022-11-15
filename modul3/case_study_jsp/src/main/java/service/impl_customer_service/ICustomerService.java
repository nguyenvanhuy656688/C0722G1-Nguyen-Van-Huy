package service.impl_customer_service;

import model.Customer;

import java.util.List;

public interface ICustomerService {

    boolean deleteById(int id);

    List<Customer> displayADelete();

    boolean edit(Customer customer);

    boolean create(Customer customer);

    List<Customer> displayAll();

    List<Customer> search(int id);

    Customer findById(int id);
}
