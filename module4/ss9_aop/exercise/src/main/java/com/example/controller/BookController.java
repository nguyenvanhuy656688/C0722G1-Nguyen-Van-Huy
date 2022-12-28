package com.example.controller;

import com.example.common.EmptyBookException;
import com.example.model.Book;
import com.example.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService iBookService;

    @GetMapping("")
    public String listBook(Model model){
        List<Book> bookList = iBookService.findAll();
        model.addAttribute("bookList",bookList);
        return "views/list";
    }

    @GetMapping("/borrow/{id}")
    public String detail(@PathVariable("id") int id, Model model){
        model.addAttribute("bookList",iBookService.findById(id).orElseThrow(()-> new IllegalArgumentException("not found")));
        return "views/detail";
    }

    @PostMapping("/borrow")
    public String borrowBook(@RequestParam int id, RedirectAttributes redirectAttributes) throws EmptyBookException {
        int code = iBookService.borrowBook(id);
        redirectAttributes.addFlashAttribute("mess", " mã sách mượn: " + code);
        return "redirect:/book";
    }


}
