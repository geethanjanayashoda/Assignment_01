
package com.example.assignment.service;

import com.example.assignment.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudent();

    List<Student> getStudentByCity(String city);

}