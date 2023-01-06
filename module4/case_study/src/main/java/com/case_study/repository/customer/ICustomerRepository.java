package com.case_study.repository.customer;

import com.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
    @Query(value = "select c.* from `customer` c join `customer_type` ct on c.customer_type_id = ct.id  where c.name like %:name% and c.email like %:email% and ct.name = :customerTypeName" ,nativeQuery = true )
    Page<Customer> listSearchByNameAndEmailAndCustomerType(@Param("name")String name,@Param("email") String email,@Param("customerTypeName") String customerTypeName, Pageable pageable);
}

