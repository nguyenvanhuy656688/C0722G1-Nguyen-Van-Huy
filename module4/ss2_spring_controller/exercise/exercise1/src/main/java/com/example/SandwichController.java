package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SandwichController {

    @PostMapping("/sandwich")
    public String sandwich(Model model,String checkbox1, String checkbox2, String checkbox3, String checkbox4){
        model.addAttribute("checkbox1",checkbox1);
        model.addAttribute("checkbox2",checkbox2);
        model.addAttribute("checkbox3",checkbox3);
        model.addAttribute("checkbox4",checkbox4);
        return "display";
    }
}
