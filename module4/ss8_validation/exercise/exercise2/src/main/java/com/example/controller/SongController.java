package com.example.controller;

import com.example.dto.SongDto;
import com.example.model.Song;
import com.example.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    private ISongService iSongService;


    @GetMapping("")
    public String list(Model model){
        List<Song> songList = iSongService.findAll();
        model.addAttribute("songList",songList);
        return "views/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model ){
        model.addAttribute("userDto",new SongDto());
        return "views/create";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("userDto") SongDto userDto, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        new SongDto().validate(userDto,bindingResult);
        Song user = new Song();
        BeanUtils.copyProperties(userDto,user);
        iSongService.save(user);
        redirectAttributes.addFlashAttribute("mess","thêm thành công");
        return "redirect:/song";
    }

    @GetMapping("/{id}/edit")
    public String showFormEdit(@PathVariable("id") int id, Model model){
        List<Song> songList = iSongService.findAll();
        model.addAttribute("songList",songList);
        model.addAttribute("blog",iSongService.findById(id));
        return "views/edit";
    }

    @PostMapping("/edit")
    public String edit(@Validated @ModelAttribute("songDto") SongDto songDto,BindingResult bindingResult,RedirectAttributes redirectAttributes){
        new SongDto().validate(songDto,bindingResult);
        Song user = new Song();
        BeanUtils.copyProperties(songDto,user);
        iSongService.save(user);
        redirectAttributes.addFlashAttribute("mess","sửa thành công");
        return "redirect:/song";
    }





}
