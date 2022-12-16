package com.example;

import com.example.model.EmailSetting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class EmailSettingController {
    IEmailSettingService iEmailSettingService = new EmailSettingService();
    @RequestMapping("/list")
    public String showList(Model model){
        List<EmailSetting> emailSettings = iEmailSettingService.display();
        model.addAttribute("emailSettings",emailSettings);
        return "list";

    }

    @RequestMapping("/edit/{id}")
    public String showEdit(@PathVariable("id") int id, Model model){
        EmailSetting emailSetting = iEmailSettingService.finById(id);
        List<String> emailSettings = iEmailSettingService.getLanguages();
        List<String> sizeList = iEmailSettingService.getSize();
        model.addAttribute("emailSettings",emailSettings);
        model.addAttribute("sizeList",sizeList);
        model.addAttribute("emailSetting",emailSetting);
        return "edit";
    }

    @PostMapping("/edit_new")
    public String edit(Model model, @ModelAttribute("emailSettings") EmailSetting emailSetting, RedirectAttributes redirectAttributes){
        iEmailSettingService.edit(emailSetting);
        redirectAttributes.addFlashAttribute("mess","Mess: Đã chỉnh sửa thành công");
        return "redirect:list";
    }
}
