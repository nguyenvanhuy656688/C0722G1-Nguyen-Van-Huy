package com.case_study.controller;

import com.case_study.model.customer.Customer;
import com.case_study.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("")
    public String listCustomer(Model model){
        List<Customer> customerList = iCustomerService.findAll();
        model.addAttribute("customerList",customerList);
        return "views/customer/list";
    }

}
