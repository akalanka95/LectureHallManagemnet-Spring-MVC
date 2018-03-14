package com.akalanka.coursemanagement.backend.dto;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="course_details")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY	)
    private int id;

    private String courseCode;
    private String courseName;
    private int year;
    @ManyToOne
    private Semester semester;

    @ManyToOne
    private Department department;
    private String description;
    @ManyToOne
    private Lecture lecture;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
}
