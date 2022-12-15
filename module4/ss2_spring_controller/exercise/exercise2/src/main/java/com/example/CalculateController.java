package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculateController {

    @GetMapping("")
    public String getCalculate(){
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(String calculate , Model model , String number1 ,String number2){
        int numberOne = Integer.parseInt(number1);
        int numberTwo = Integer.parseInt(number2);
        int result;
        String mess = "Kết quả là:";
        switch (calculate){
            case "calculate1":
                result = numberOne + numberTwo;
                mess = mess + result;
                break;
            case "calculate2":
                result = numberOne - numberTwo;
                mess = mess+ result;
                break;
            case "calculate3":
                result =  numberOne * numberTwo;
                mess =  mess + result;
                break;
            case "calculate4":
                result = numberOne/numberTwo;
                mess = mess + result;
                break;
        }
        model.addAttribute("mess",mess);
        return "index";
    }
}
