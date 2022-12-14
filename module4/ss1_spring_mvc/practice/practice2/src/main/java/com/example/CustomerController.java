package com.example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class CustomerController {
    ICustomerRepository iCustomerRepository = new CustomerRepository();
    @GetMapping("/customers")
    public String showList(@RequestParam String name, Model model) {
        List<Customers> customersList = iCustomerRepository.findAll();
        model.addAttribute("name", name);
        model.addAttribute("customersList", customersList);
        return "list";
    }
}
