package com.example.controller;

import com.example.common.EmptyBookException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandleController {
    @ExceptionHandler(EmptyBookException.class)
    public String error(){
        return "views/errorPage";
    }
}
