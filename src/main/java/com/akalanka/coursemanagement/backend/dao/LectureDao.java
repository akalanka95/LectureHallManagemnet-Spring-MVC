package com.akalanka.coursemanagement.backend.dao;

import com.akalanka.coursemanagement.backend.dto.Lecture;

import java.util.List;


public interface LectureDao {


    boolean addLecture(Lecture lecture);
    boolean updateLecture(Lecture lecture);
    boolean deleteLecture(Lecture lecture);
    Lecture get(int id);
    Lecture getfromcontactnumber(String contact);


    List<Lecture> lectureList();
}
