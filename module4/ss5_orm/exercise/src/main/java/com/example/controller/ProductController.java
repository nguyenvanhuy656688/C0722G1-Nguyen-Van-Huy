package com.example.controller;

import com.example.model.Product;
import com.example.service.IProductService;
import com.example.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("product", iProductService.findById(id));
        return "view";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model ){
        model.addAttribute("product",new Product());
        return "create";
    }

    @PostMapping("/create")
    public String create(Product product ){
        iProductService.save(product);
        return "redirect:/product/";
    }

    @GetMapping("/{id}/edit")
    public String showFormEdit(@PathVariable("id") int id, Model model){
        model.addAttribute("product",iProductService.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("product") Product product){
        iProductService.editById(product);
        return "redirect:/product/";
    }

    @GetMapping("/search")
    public String search( String name, Model model){
        List<Product> productList = iProductService.searchByPrice(name);
        model.addAttribute("productList",productList);
        return "list";
    }
}
