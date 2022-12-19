package com.example.service;

import com.example.model.Customer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {
    private static Map<Integer, Customer> customerMap = new LinkedHashMap<>();
    static {
        customerMap.put(1, new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        customerMap.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        customerMap.put(3, new Customer(3,"Alex", "alex@codegym.vn", "Saigon"));
        customerMap.put(4, new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }


    @Override
    public List<Customer> list() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Object findById(int id) {
        return null;
    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public void update(int id, Customer customer) {
        customerMap.put(id, customer);
    }
}
