package com.example.dto;

import com.example.model.User;
import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserDto implements Validator {
    private int id;
    @Size(min = 5,max = 45 , message = "Mời nhập trong khoảng 5-45")
    private String firstName;
    @Size(min = 5,max = 45 , message = "Mời nhập trong khoảng 5-45")
    private String lastName;
    private String phoneNumber;

    @Min(value = 18, message = "Bạn phải >= 18t")
    @Max(value = 200)
    private int age;
    @Column(columnDefinition = "varchar(200) unique")
    @Email(regexp = "[\\w]+@gmail.com",message = "Nhập đuôi .com nha")
    private String email;



    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
        char phoneNum = userDto.getPhoneNumber().charAt(0);
            String regex = "([\\d]{10})";
        if (phoneNum!=0 && !regex.matches(userDto.getPhoneNumber())){
            errors.rejectValue("phoneNumber","phoneNumber","Số đầu tiên phải là số 0");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
