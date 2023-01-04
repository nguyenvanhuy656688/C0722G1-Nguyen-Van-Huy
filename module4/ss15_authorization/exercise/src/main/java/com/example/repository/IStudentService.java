package com.example.repository;

import com.example.model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    void deleteById(int id);
}
