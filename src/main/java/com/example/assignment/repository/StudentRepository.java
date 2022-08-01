package com.example.assignment.repository;

import com.example.assignment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findStudentByCity(String city);


}
