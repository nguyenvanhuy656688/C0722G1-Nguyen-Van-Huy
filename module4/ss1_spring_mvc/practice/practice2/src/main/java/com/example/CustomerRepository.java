package com.example;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    static List<Customers> customersList = new ArrayList<>();
    static {
        customersList.add(new Customers(156,"huy","huycute@123","692 NLB"));
        customersList.add(new Customers(289,"huy1","huycute1@123","692 NLB"));
        customersList.add(new Customers(321,"huy2","huycute2@123","692 NLB"));
        customersList.add(new Customers(455,"huy3","huycute3@123","692 NLB"));
    }
    @Override
    public List<Customers> findAll() {
        return customersList;
    }
}
