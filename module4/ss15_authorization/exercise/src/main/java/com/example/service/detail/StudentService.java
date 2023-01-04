package com.example.service.detail;

import com.example.model.Student;
import com.example.repository.IStudentRepository;
import com.example.repository.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository iStudentRepository;

    @Override
    public List<Student> findAll() {
        return iStudentRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        iStudentRepository.deleteById(id);
    }
}
