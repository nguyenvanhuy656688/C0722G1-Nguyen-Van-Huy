package repository.impl_customer;

import model.CustomerType;

import java.util.List;

public interface ICustomerTypeRepository {
     List<CustomerType> selectAll();
}
