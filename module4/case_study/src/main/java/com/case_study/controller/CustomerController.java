package com.case_study.controller;

import com.case_study.dto.CustomerDto;
import com.case_study.model.customer.Customer;
import com.case_study.model.customer.CustomerType;
import com.case_study.service.customer.ICustomerService;
import com.case_study.service.customer.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
        model.addAttribute("customerDto",new CustomerDto());
        return "views/customer/create";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("customerDto") CustomerDto customerDto , Pageable pageable, BindingResult bindingResult, Model model){
        new CustomerDto().validate(customerDto,bindingResult);
        new CustomerDto().checkExist(iCustomerService.findAll(pageable),customerDto,bindingResult);
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto,customer);
        if (bindingResult.hasErrors()){
            model.addAttribute("customerTypeList",iCustomerTypeService.findAll());
            model.addAttribute("mess","Thêm mới không thành công");
            return "views/customer/create";
        }
        iCustomerService.save(customer);
        model.addAttribute("mess","Thêm mới thành công");
        return "views/customer/create";
    }

    @GetMapping("/{id}/edit")
    public String showFormEdit(@PathVariable("id") int id, Model model){
        List<CustomerType> customerTypeList = iCustomerTypeService.findAll();
        model.addAttribute("customer",iCustomerService.findById(id));
        model.addAttribute("customerTypeList",customerTypeList);
        return "views/customer/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("customer") Customer customer,Model model){
        iCustomerService.save(customer);
        model.addAttribute("mess","Sửa thành công");
        return "views/customer/edit";
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
