package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/convert")
public class ConvertController {
    @GetMapping("")
    public String convert(Model model,String money,String unit){
        double money1 = Double.parseDouble(money);
        int choose = Integer.parseInt(unit);
        double result1;
        switch (choose){
            case 1:
                result1 = (money1*23000) ;
                break;
            case 2:
                result1 = (money1/23000) ;
                break;
            default:
                result1=0;
        }
        model.addAttribute("result1",result1);
        return "result";
    }
}
