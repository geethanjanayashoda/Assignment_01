package com.example.assignment.service.impl;

import com.example.assignment.dto.StudentDTO;
import com.example.assignment.model.Student;
import com.example.assignment.repository.StudentRepository;
import com.example.assignment.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiseImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ModelMapper modelMapper;

    public StudentDTO createStudent(StudentDTO studentDTO) {
        studentRepository.save(modelMapper.map(studentDTO, Student.class));
        return studentDTO;
    }


    @Override
    public List<Student> getStudentByCity(String city) {

        return studentRepository.findStudentByCity(city);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

}
