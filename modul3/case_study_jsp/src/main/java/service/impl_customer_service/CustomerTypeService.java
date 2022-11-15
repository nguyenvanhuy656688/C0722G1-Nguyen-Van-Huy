package service.impl_customer_service;

import model.CustomerType;
import repository.impl_customer.CustomerTypeRepository;
import repository.impl_customer.ICustomerTypeRepository;

import java.util.List;

public class CustomerTypeService implements ICustomerTypeService {
    private ICustomerTypeRepository customerTypeRepository = new CustomerTypeRepository();

    @Override
    public List<CustomerType> selectAll() {
        return customerTypeRepository.selectAll();
    }
}
