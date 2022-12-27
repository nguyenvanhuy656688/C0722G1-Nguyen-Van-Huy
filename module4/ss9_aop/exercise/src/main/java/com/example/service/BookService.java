package com.example.service;

import com.example.model.Book;
import com.example.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService {
    @Autowired
    IBookRepository iBookRepository;

    @Override
    public List<Book> findAll() {
        return iBookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(int id) {
        return iBookRepository.findById(id);
    }

    @Override
    public int borrowBook(int id) throws Exception {
        Book book = findById(id).orElseThrow(()-> new IllegalArgumentException("not found"));
        if(book.getTotalBook()<=0)
            throw new Exception();
        book.setTotalBook(book.getTotalBook()-1);
        int code= (int) Math.floor(((Math.random() * 89999) + 10000));
        book.setBookCode(code);
        iBookRepository.save(book);
        return code;
    }
}
