package com.example.service;

import com.example.model.Song;

import java.util.List;
import java.util.Optional;

public interface ISongService {
    void save(Song user);

    List<Song> findAll();

    Optional<Song> findById(int id);
}
