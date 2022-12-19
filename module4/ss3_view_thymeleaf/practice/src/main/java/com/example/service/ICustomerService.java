package com.example.service;

import com.example.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> list();

    Object findById(int id);

    void remove(int id);

    void save(Customer customer);

    void update(int id, Customer customer);
}
