package com.example.controller;

import com.example.model.Student;
import com.example.repository.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService iStudentService;


    @GetMapping("")
    public String listStudent(Model model){
        List<Student> studentList = iStudentService.findAll();
        model.addAttribute("studentList",studentList);
        return "views/list";
    }

    @GetMapping("{id}/delete")
    public String delete(@PathVariable("id") int id ){
        iStudentService.deleteById(id);
        return "redirect:/";
    }

}
