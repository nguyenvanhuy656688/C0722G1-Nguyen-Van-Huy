package com.example.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class SongDto implements Validator {
    private int id;
    @NotEmpty(message = "Không đc để trống")
    @Size(min = 0, max = 800, message = "Nhập trong khoảng 0-800")
    @Pattern(regexp = "[a-zA-z1-9]+")
    private String name;
    @NotEmpty(message = "Không đc để trống")
    @Size(min = 0, max = 300, message = "Nhập trong khoảng 0-300")
    @Pattern(regexp = "[a-zA-z1-9]+")
    private String singer;
    @NotEmpty(message = "Không đc để trống")
    @Size(min = 0, max = 1000, message = "Nhập trong khoảng 0-1000")
    private String category;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        SongDto songDto = (SongDto) target;
        String regex ="[@][;][=][-][+][*][/]";
        String regex1 ="[,]";
        String regex3 ="([\\d]{10})";
        if (regex.matches(songDto.getName())){
            errors.rejectValue("name","name","Không đc chứa kí tự đặc biệt");
        }
        if (regex.matches(songDto.getSinger())){
            errors.rejectValue("singer","singer","Không đc chứa kí tự đặc biệt");
        }
        if (!songDto.getCategory().contains(regex1)  || !songDto.getCategory().matches(regex3)){
            errors.rejectValue("category","category","chỉ đc chứa dấu ,");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
