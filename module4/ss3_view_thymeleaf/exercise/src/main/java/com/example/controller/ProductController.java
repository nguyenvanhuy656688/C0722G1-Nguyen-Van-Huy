package com.example.controller;

import com.example.model.Product;
import com.example.service.IProductService;
import com.example.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private static IProductService iProductService = new ProductService();
    @GetMapping("")
    public String list(Model model){
        List<Product> productList = iProductService.list();
        model.addAttribute("productList",productList);
        return "list";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.deleteById(id));
        return "redirect:/product/";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.showById(id));
        return "view";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model ){
        model.addAttribute("product",new Product());
        return "create";
    }

    @PostMapping("/create")
    public String create(Product product){
        iProductService.save(product);
        return "redirect:/product/";
    }

    @GetMapping("/edit")
    public String showFormEdit( Model model){
        model.addAttribute("product",new Product());
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String edit(@PathVariable int id, Product product){
        iProductService.editById(id,product);
        return "redirect:/product/";
    }
}
