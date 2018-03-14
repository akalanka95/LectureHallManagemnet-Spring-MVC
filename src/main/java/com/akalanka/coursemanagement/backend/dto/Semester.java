package com.akalanka.coursemanagement.backend.dto;


import javax.persistence.*;

@Entity
@Table(name = "semester_details")
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY	)
    private int id;

    private String semesterName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }
}
