package com.example.assignment.controller;

import com.example.assignment.dto.StudentDTO;
import com.example.assignment.model.Student;
import com.example.assignment.service.StudentService;
import com.example.assignment.service.impl.StudentServiseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiseImpl studentServiseImpl;

    @Autowired
    private StudentService studentService;

    @PostMapping("/student-create")
    public StudentDTO createStudent(@RequestBody StudentDTO studentDTO) {

        return studentServiseImpl.createStudent(studentDTO);

    }

    @RequestMapping("/student-list")
    public ResponseEntity<List<Student>> studentList() {
        return new ResponseEntity<>(studentService.getAllStudent(), HttpStatus.OK);
    }

    @GetMapping("/student-city")
    public ResponseEntity<List<Student>> studentDetails(@RequestParam String city) {

        List<Student> studentList = studentService.getStudentByCity(city);

        if (studentList.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }


}
