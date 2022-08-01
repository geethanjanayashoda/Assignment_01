package com.example.assignment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank
    @Size(max = 10)
    private String studentNumber;

    @NotBlank
    @Size(max = 20)
    private String studentName;

    @NotBlank
    @Size(max = 20)
    private String city;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(max = 12)
    private int tellNum;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "student_subject",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "sID")
    )
    private Set<Subject> subjects = new HashSet<>();


}
