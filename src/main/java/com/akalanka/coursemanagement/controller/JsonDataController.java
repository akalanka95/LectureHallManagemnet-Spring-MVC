package com.akalanka.coursemanagement.controller;


import com.akalanka.coursemanagement.backend.dao.CourseDao;
import com.akalanka.coursemanagement.backend.dao.DepartmentRefDao;
import com.akalanka.coursemanagement.backend.dao.LectureDao;
import com.akalanka.coursemanagement.backend.dao.TimeTableDao;
import com.akalanka.coursemanagement.backend.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {

    @Autowired
    private LectureDao lectureDao;
    @Autowired
    private DepartmentRefDao departmentRefDao;
    @Autowired
    private TimeTableDao timeTableDao;
    @Autowired
    private CourseDao courseDao;

    @RequestMapping("/lectures")
    @ResponseBody
    public List<Lecture> getAllLectures(){
        return lectureDao.lectureList();
    }

    @RequestMapping("/departmentref")
    @ResponseBody
    public List<DepartmentRef> getAllDepartmentRef(){
        return departmentRefDao.departmentRefList();
    }

    @RequestMapping("/course")
    @ResponseBody
    public List<Course> getAllCourseList(){
        return courseDao.courseList() ;
    }

    /*@RequestMapping("/lectureschedule")
    @ResponseBody
    public List<TimeTable> getLectureSchedule(){
      return timeTableDao.getLectureHallsList();
    }*/

}
