package repository.impl_customer;

import model.Customer;

import java.util.List;

public interface ICustomerRepository {
    boolean deleteById(int id);

    List<Customer> displayADelete();

    boolean edit(Customer customer);

    void create(Customer customer);

    List<Customer> displayAll();

    List<Customer> search(int idSearch);

    Customer showFormEdit(int id);
}
