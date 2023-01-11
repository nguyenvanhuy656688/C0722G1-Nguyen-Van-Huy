package com.case_study.controller;

import com.case_study.common.HandleException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandleController {
    @ExceptionHandler(Exception.class)
    public String errors() {
        return "views/errors";
    }
}
