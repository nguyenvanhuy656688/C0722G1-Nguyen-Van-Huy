package com.example.service;
import com.example.dto.UserDto;
import com.example.model.User;
import com.example.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService{
    @Autowired
    IUserRepository iUserRepository;

    @Override
    public void save(User userDto) {
        iUserRepository.save(userDto);
    }
}
