package com.case_study.controller;

import com.case_study.model.customer.Customer;
import com.case_study.model.customer.CustomerType;
import com.case_study.service.customer.ICustomerService;
import com.case_study.service.customer.ICustomerTypeService;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("customerTypeList",iCustomerTypeService.findAll());
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

    @GetMapping("/{id}/edit")
    public String showFormEdit(@PathVariable("id") int id, Model model){
        List<CustomerType> customerTypeList = iCustomerTypeService.findAll();
        model.addAttribute("categoryList",customerTypeList);
        model.addAttribute("customer",iCustomerService.findById(id));
        return "views/customer/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("customer") Customer customer){
        iCustomerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id) {
        iCustomerService.deleteById(id);
        return "redirect:/customer";
    }

    @PostMapping("/search")
    public String searchByNameAndEmailAndCustomerType(String name,String email,String customerTypeName,Model model,@PageableDefault(size = 5) Pageable pageable){
        Page<Customer> customerList = iCustomerService.listSearchByNameAndEmailAndCustomerType(name,email,customerTypeName,pageable);
        model.addAttribute("customerList",customerList);
        model.addAttribute("customerTypeList",iCustomerTypeService.findAll());
        model.addAttribute("customerTypeName",customerTypeName);
        return "views/customer/list";
    }


}
