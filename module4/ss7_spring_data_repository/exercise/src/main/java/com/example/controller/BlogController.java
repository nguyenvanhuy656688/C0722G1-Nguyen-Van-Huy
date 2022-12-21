package com.example.controller;

import com.example.model.Blog;
import com.example.service.BlogService;
import com.example.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
   IBlogService iBlogService;

    @GetMapping("")
    public String list(Model model){
        List<Blog> blogList = iBlogService.findAll();
        model.addAttribute("blogList",blogList);
        return "views/list";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id) {
        iBlogService.deleteById(id);
        return "redirect:/blog/";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model ){
        model.addAttribute("blog",new Blog());
        return "views/create";
    }

    @PostMapping("/create")
    public String create(Blog blog ){
        iBlogService.save(blog);
        return "redirect:/blog/";
    }

    @GetMapping("/{id}/edit")
    public String showFormEdit(@PathVariable("id") int id, Model model){
        model.addAttribute("blog",iBlogService.findById(id));
        return "views/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("blog") Blog blog){
        iBlogService.save(blog);
        return "redirect:/blog/";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "views/view";
    }


}
