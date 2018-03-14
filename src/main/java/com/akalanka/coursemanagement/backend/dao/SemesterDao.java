package com.akalanka.coursemanagement.backend.dao;

import com.akalanka.coursemanagement.backend.dto.Semester;

import java.util.List;

public interface SemesterDao {

    boolean addSemester(Semester semester);
    Semester get(int id);
    List<Semester> getlist(int id);
    List<Semester> allSemesterList();
}
