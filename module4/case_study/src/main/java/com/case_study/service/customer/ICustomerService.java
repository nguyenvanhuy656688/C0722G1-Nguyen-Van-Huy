package com.case_study.service.customer;

import com.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);

    void save(Customer customer);

    Optional<Customer> findById(int id);

    void deleteById(int id);

    Page<Customer> listSearchByNameAndEmailAndCustomerType(String name, String email, String customerTypeName, Pageable pageable);
}
