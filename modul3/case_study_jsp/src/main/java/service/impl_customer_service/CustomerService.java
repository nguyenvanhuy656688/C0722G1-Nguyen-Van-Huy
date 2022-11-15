package service.impl_customer_service;

import model.Customer;
import repository.impl_customer.CustomerRepository;
import repository.impl_customer.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public boolean deleteById(int id) {
        return iCustomerRepository.deleteById(id);
    }

    @Override
    public List<Customer> displayADelete() {
        return iCustomerRepository.displayADelete();
    }

    @Override
    public boolean edit(Customer customer) {
         return iCustomerRepository.edit(customer);
    }

    @Override
    public boolean create(Customer customer) {
        return iCustomerRepository.create(customer);
    }

    @Override
    public List<Customer> displayAll() {
        return iCustomerRepository.displayAll();
    }

    @Override
    public List<Customer> search(int id) {
       return iCustomerRepository.search(id);
    }

    @Override
    public Customer findById(int id) {
        return iCustomerRepository.findById(id);
    }
}
