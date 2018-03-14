package com.akalanka.coursemanagement.backend.dao;

import com.akalanka.coursemanagement.backend.dto.LectureHall;

import java.util.List;

public interface LectureHallDao {

    boolean addLectureHall(LectureHall lectureHall);
    LectureHall get(int id);
    List<LectureHall> lectureHallList();

}
