package com.example.controller;

import com.example.dto.CartDto;
import com.example.dto.ProductDto;
import com.example.model.Product;
import com.example.service.IProductService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/shop")
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @ModelAttribute("cart")
    public CartDto initCart(){
        return new CartDto();
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable("id") int id,
                            @SessionAttribute("cart") CartDto cartDto){
        Product product = iProductService.findById(id);
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product,productDto);
        cartDto.addProduct(productDto);
        return "redirect/cart";
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable("id") int id , HttpServletResponse response){
        Cookie cookie = new Cookie("idProduct",String.valueOf(id));
        cookie.setMaxAge(30);
        cookie.setPath("/");
        response.addCookie(cookie);
        return new ModelAndView("product/detail","product",iProductService.findById(id));
    }

    @GetMapping("")
    public ModelAndView listPage(Model model,@CookieValue(value = "idProduct",defaultValue = "-1") int id){
        if (id!= -1){
            model.addAttribute("historyProduct",iProductService.findById(id));
        }
        return new ModelAndView("product/list","productList", iProductService.findAll());
    }


}
