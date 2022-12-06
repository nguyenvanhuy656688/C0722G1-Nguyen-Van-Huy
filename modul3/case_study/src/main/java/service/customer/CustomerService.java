package service.customer;

import model.Customer;
import repository.customer.CustomerRepository;
import repository.customer.ICustomerRepository;

import java.lang.ref.SoftReference;
import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public List<Customer> displayAll() {
        return iCustomerRepository.displayAll();
    }

    @Override
    public boolean create(Customer customer) {
        return iCustomerRepository.create(customer);
    }

    @Override
    public Customer editById(int id) {
        return iCustomerRepository.editById(id);
    }

    @Override
    public boolean edit(Customer customer) {
        return iCustomerRepository.edit(customer);
    }

    @Override
    public List<Customer> search(int id , String name , String address) {
        return iCustomerRepository.search(id,name,address);
    }

    @Override
    public boolean delete(int id) {
        return iCustomerRepository.delete(id);
    }
}
