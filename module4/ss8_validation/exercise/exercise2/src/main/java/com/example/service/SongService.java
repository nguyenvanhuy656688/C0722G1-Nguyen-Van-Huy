package com.example.service;

import com.example.model.Song;
import com.example.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService{
    @Autowired
    private ISongRepository iSongRepository;
    @Override
    public void save(Song user) {
        iSongRepository.save(user);
    }

    @Override
    public List<Song> findAll() {
        return iSongRepository.findAll();
    }
}
