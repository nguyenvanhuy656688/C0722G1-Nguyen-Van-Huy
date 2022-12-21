package com.example.service;

import com.example.model.Blog;

import java.util.List;
import java.util.Optional;

public interface IBlogService {

    List<Blog> findAll();

    void deleteById(int id);

    void save(Blog blog);

    Optional<Blog> findById(int id);
}
