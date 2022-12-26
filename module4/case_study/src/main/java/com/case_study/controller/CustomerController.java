package com.case_study.controller;

import com.case_study.model.customer.Customer;
import com.case_study.model.customer.CustomerType;
import com.case_study.service.customer.ICustomerService;
import com.case_study.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @Autowired
    private ICustomerTypeService iCustomerTypeService;



    @GetMapping("")
    public String listCustomer(Model model, @PageableDefault(size = 5) Pageable pageable){
        Page<Customer> customerList = iCustomerService.findAll(pageable);
        model.addAttribute("customerList",customerList);
        return "views/customer/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model ){
        List<CustomerType> customerTypeList = iCustomerTypeService.findAll();
        model.addAttribute("customerTypeList",customerTypeList);
        model.addAttribute("customer",new Customer());
        return "views/customer/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("customer") Customer customer ){
        iCustomerService.save(customer);
        return "redirect:/customer";
    }



}
