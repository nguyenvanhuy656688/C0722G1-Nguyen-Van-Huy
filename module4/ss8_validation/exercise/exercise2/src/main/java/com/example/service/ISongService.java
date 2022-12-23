package com.example.service;

import com.example.model.Song;

import java.util.List;

public interface ISongService {
    void save(Song user);

    List<Song> findAll();
}
