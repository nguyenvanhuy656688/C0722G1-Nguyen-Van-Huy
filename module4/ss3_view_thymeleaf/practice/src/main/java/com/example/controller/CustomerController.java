package com.example.controller;

import com.example.model.Customer;
import com.example.service.CustomerService;
import com.example.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
@RequestMapping("/customer")
@Controller
public class CustomerController {
    private static ICustomerService iCustomerService =new CustomerService();
    @RequestMapping("")
    public String index(Model model){
        List<Customer> customerList = iCustomerService.list();
        model.addAttribute("customers",customerList);
        return "list";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("customer", iCustomerService.findById(id));
        return "view";
    }

    @PostMapping("delete")
    public String delete(Customer customer, RedirectAttributes redirect) {
        iCustomerService.remove(customer.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/customer";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("/save")
    public String save(Customer customer) {
        customer.setId((int) (Math.random() * 10000));
        iCustomerService.save(customer);
        return "redirect:/customer";
    }

    @PostMapping("/update")
    public String update(Customer customer) {
        iCustomerService.update(customer.getId(), customer);
        return "redirect:/customer";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("customer", iCustomerService.findById(id));
        return "edit";
    }


}
