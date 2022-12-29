package com.example.service.blog;

import com.example.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService {

    Page<Blog> findAll(Pageable pageable);

    Optional<Blog> deleteById(int id);

    void save(Blog blog);

    Optional<Blog> findById(int id);

    List<Blog> listSearchByName(String name);
}
