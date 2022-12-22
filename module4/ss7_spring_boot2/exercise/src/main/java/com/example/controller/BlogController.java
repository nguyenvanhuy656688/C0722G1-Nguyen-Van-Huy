package com.example.controller;

import com.example.model.Blog;
import com.example.model.Category;
import com.example.service.blog.IBlogService;
import com.example.service.category.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
   IBlogService iBlogService;

    @Autowired
    ICategoryService iCategoryService;

    @GetMapping("")
    public String list(Model model , @PageableDefault(size = 2) Pageable pageable) {
        Page<Blog> blogList = iBlogService.findAll(pageable);
        model.addAttribute("blogList",blogList);
        return "views/list";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        iBlogService.deleteById(id);
        return "redirect:/blog";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model ){
        List<Category> categoryList = iCategoryService.findAll();
        model.addAttribute("categoryList",categoryList);
        model.addAttribute("blog",new Blog());
        return "views/create";
    }

    @PostMapping("/create")
    public String create(Blog blog ,Model model){
        iBlogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/{id}/edit")
    public String showFormEdit(@PathVariable("id") int id, Model model){
        List<Category> categoryList = iCategoryService.findAll();
        model.addAttribute("categoryList",categoryList);
        model.addAttribute("blog",iBlogService.findById(id));
        return "views/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute("blog") Blog blog,Model model){
        iBlogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable("id") int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found blog")));
        return "views/view";
    }

    @GetMapping("/search")
    public String searchByName(String name,Model model){
        List<Blog> blogList = iBlogService.listSearchByName(name);
        model.addAttribute("blogList",blogList);
        return "redirect:/blog";
    }
}
