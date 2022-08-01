package com.example.assignment.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {

    private long id;
    private String studentNumber;
    private String studentName;
    private String city;
    private String email;
    private int tellNum;

}
