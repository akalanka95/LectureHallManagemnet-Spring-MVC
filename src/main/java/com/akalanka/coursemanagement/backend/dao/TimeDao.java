package com.akalanka.coursemanagement.backend.dao;

import com.akalanka.coursemanagement.backend.dto.Department;
import com.akalanka.coursemanagement.backend.dto.Time;

import java.util.List;

public interface TimeDao {

    boolean addTime(Time time);
    Time get(int id);
    List<Time> getTimetList();
}
