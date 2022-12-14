package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DictionaryController {
    @RequestMapping("/dictionary")
    public String dictionary(Model model,String dictionary){
        String[] arr = {"chicken","elephent","giraffe","cow","horse"};
        String[] arr1 = {"con gà","con voi","hưu cao cổ","con bò","con ngựa"};
        String keyWord = dictionary;
        String means = "Không tìm thấy";
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equals(keyWord)){
                means = "nghĩa của"+""+arr[i]+" là:"+ arr1[i];
                break;
            }
        }
        model.addAttribute("means",means);
        return "/result";
    }

}
