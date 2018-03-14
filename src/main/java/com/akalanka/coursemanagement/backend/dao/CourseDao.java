package com.akalanka.coursemanagement.backend.dao;

import com.akalanka.coursemanagement.backend.dto.Course;
import com.akalanka.coursemanagement.backend.dto.DepartmentRef;

import java.util.List;

public interface CourseDao {


    boolean addCourse(Course course);
    Course get(int id);
    List<Course> getSemDepCourseList(int depid,int semid);
    //boolean updateDepartmentRef(DepartmentRef departmentRef);
    //boolean deleteDepartmentRef(DepartmentRef departmentRef);
    //DepartmentRef get(int id);


    List<Course> courseList();
}
