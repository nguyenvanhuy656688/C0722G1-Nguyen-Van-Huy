package com.example.controller;

import com.example.dto.UserDto;
import com.example.model.User;
import com.example.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("")
    public String result(){
        return "/views/result";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model ){
        model.addAttribute("userDto",new UserDto());
        return "views/create";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("userDto") UserDto userDto, BindingResult bindingResult, RedirectAttributes redirectAttributes){
       new UserDto().validate(userDto,bindingResult);
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("mess","thêm không thành công");
            return "views/create";
        }
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        iUserService.save(user);
        redirectAttributes.addFlashAttribute("mess","thêm thành công");
        return "redirect:/user";
    }

}
