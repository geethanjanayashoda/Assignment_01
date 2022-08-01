package com.example.assignment.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Subject {

    @Id
    private long sId;

    @NotBlank
    @Size(max = 20)
    private String subejctName;

    @ManyToMany(mappedBy = "subjects")
    private Set<Student> students = new HashSet<>();


    public Subject(long sId, String subejctName) {
        this.sId = sId;
        this.subejctName = subejctName;
    }

    public Subject() {

    }

    public long getsId() {
        return sId;
    }

    public void setsId(long sId) {
        this.sId = sId;
    }

    public String getSubejctName() {
        return subejctName;
    }

    public void setSubejctName(String subejctName) {
        this.subejctName = subejctName;
    }
}
