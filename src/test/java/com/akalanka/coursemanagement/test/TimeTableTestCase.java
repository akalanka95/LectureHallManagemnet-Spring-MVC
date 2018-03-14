package com.akalanka.coursemanagement.test;

import com.akalanka.coursemanagement.backend.dao.*;
import com.akalanka.coursemanagement.backend.dto.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.List;

import static java.util.Calendar.AM;
import static org.junit.Assert.assertEquals;

public class TimeTableTestCase {

    private static AnnotationConfigApplicationContext context;

    private static TimeTableDao timeTableDao;
    private static DepartmentDao departmentDao;
    private static CourseDao courseDao;
    private static LectureDao lectureDao;
    private static LectureHallDao lectureHallDao;
    private static SemesterDao semesterDao;
    private static TimeDao timeDao;

    private Course course;
    private Department department;
    private Lecture lecture;
    private TimeTable timeTable;
    private LectureHall lectureHall;
    private  Semester semester;
    private Time time;

    @BeforeClass
    public static void init() {
        context = new AnnotationConfigApplicationContext();
        context.scan("com.akalanka.coursemanagement");
        context.refresh();
        timeTableDao = (TimeTableDao) context.getBean("timeTableDao");
        courseDao = (CourseDao) context.getBean("courseDao");
        lectureDao = (LectureDao) context.getBean("lectureDao");
        departmentDao = (DepartmentDao) context.getBean("departmentDao");
        lectureHallDao = (LectureHallDao) context.getBean("lectureHallDao");
        semesterDao = (SemesterDao) context.getBean(("semesterDao"));
        timeDao = (TimeDao) context.getBean(("timeDao"));

    }

    @Test
    public void addTimeTable() {

       /* timeTable = new TimeTable();

        timeTable.setDay("Monday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(3);
        timeTable.setStartTime(time);

        time =timeDao.get(8);
        timeTable.setEndTime(time);

        course =courseDao.get(1);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(3);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(2);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);

        /*List<TimeTable> timetable1 = timeTableDao.getlecturedayid("Friday",2);
        for (TimeTable element : timetable1) {
            element.setActive(false);
            assertEquals("Added successfully", true,timeTableDao.updatetimetablelectureday(element));

        }*/

        //assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));
       // assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        //assertEquals("Added successfully", 1,timeTableDao.getlecturedayid("Friday",2).size());
        //assertEquals("Added successfully", 1,timeTableDao.cancellecture("Monday",1,2,1,1).size());
        //assertEquals("sucess",1 ,timeTableDao.getLectureHallsList("Friday").size());

        timeTable = new TimeTable();

        timeTable.setDay("Monday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(11);
        timeTable.setStartTime(time);

        time =timeDao.get(15);
        timeTable.setEndTime(time);

        course =courseDao.get(1);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(4);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(3);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);

        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));
        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));

        //assertEquals("sucess",1 ,timeTableDao.getLectureHallsList("Friday").size());



        timeTable = new TimeTable();

        timeTable.setDay("Tuesday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(5);
        timeTable.setStartTime(time);

        time =timeDao.get(9);
        timeTable.setEndTime(time);

        course =courseDao.get(2);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(3);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(2);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);

        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));
        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));

        //assertEquals("sucess",1 ,timeTableDao.getLectureHallsList("Friday").size());




        timeTable = new TimeTable();

        timeTable.setDay("Tuesday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(11);
        timeTable.setStartTime(time);

        time =timeDao.get(15);
        timeTable.setEndTime(time);

        course =courseDao.get(3);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(9);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(3);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Wednesday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(5);
        timeTable.setStartTime(time);

        time =timeDao.get(9);
        timeTable.setEndTime(time);

        course =courseDao.get(4);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(2);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(3);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Wednesday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(11);
        timeTable.setStartTime(time);

        time =timeDao.get(15);
        timeTable.setEndTime(time);

        course =courseDao.get(5);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(1);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(1);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));





        timeTable = new TimeTable();

        timeTable.setDay("Thursday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(1);
        timeTable.setStartTime(time);

        time =timeDao.get(5);
        timeTable.setEndTime(time);

        course =courseDao.get(6);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(5);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(1);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Thursday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(11);
        timeTable.setStartTime(time);

        time =timeDao.get(15);
        timeTable.setEndTime(time);

        course =courseDao.get(7);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(3);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(3);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);

        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));
        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));

        //assertEquals("sucess",1 ,timeTableDao.getLectureHallsList("Friday").size());




        timeTable = new TimeTable();

        timeTable.setDay("Thursday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(15);
        timeTable.setStartTime(time);

        time =timeDao.get(19);
        timeTable.setEndTime(time);

        course =courseDao.get(5);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(1);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(1);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);

        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));
        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));

        //assertEquals("sucess",1 ,timeTableDao.getLectureHallsList("Friday").size());




        timeTable = new TimeTable();

        timeTable.setDay("Friday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(1);
        timeTable.setStartTime(time);

        time =timeDao.get(5);
        timeTable.setEndTime(time);

        course =courseDao.get(6);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(5);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(1);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Friday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(11);
        timeTable.setStartTime(time);

        time =timeDao.get(15);
        timeTable.setEndTime(time);

        course =courseDao.get(8);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(1);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(1);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Monday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(1);
        timeTable.setStartTime(time);

        time =timeDao.get(5);
        timeTable.setEndTime(time);

        course =courseDao.get(9);
        timeTable.setCourse(course);

        department = departmentDao.get(2);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(6);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(6);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Monday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(5);
        timeTable.setStartTime(time);

        time =timeDao.get(9);
        timeTable.setEndTime(time);

        course =courseDao.get(10);
        timeTable.setCourse(course);

        department = departmentDao.get(2);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(7);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(7);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));





        timeTable = new TimeTable();

        timeTable.setDay("Monday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(11);
        timeTable.setStartTime(time);

        time =timeDao.get(15);
        timeTable.setEndTime(time);

        course =courseDao.get(11);
        timeTable.setCourse(course);

        department = departmentDao.get(2);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(8);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(6);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Monday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(15);
        timeTable.setStartTime(time);

        time =timeDao.get(19);
        timeTable.setEndTime(time);

        course =courseDao.get(12);
        timeTable.setCourse(course);

        department = departmentDao.get(2);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(9);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(7);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Tuesday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(1);
        timeTable.setStartTime(time);

        time =timeDao.get(5);
        timeTable.setEndTime(time);

        course =courseDao.get(13);
        timeTable.setCourse(course);

        department = departmentDao.get(2);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(8);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(6);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));

        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));



        timeTable = new TimeTable();

        timeTable.setDay("Tuesday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(5);
        timeTable.setStartTime(time);

        time =timeDao.get(9);
        timeTable.setEndTime(time);

        course =courseDao.get(14);
        timeTable.setCourse(course);

        department = departmentDao.get(2);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(3);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(2);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Tuesday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(11);
        timeTable.setStartTime(time);

        time =timeDao.get(15);
        timeTable.setEndTime(time);

        course =courseDao.get(15);
        timeTable.setCourse(course);

        department = departmentDao.get(2);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(6);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(7);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));





        timeTable = new TimeTable();

        timeTable.setDay("Wednesday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(1);
        timeTable.setStartTime(time);

        time =timeDao.get(5);
        timeTable.setEndTime(time);

        course =courseDao.get(16);
        timeTable.setCourse(course);

        department = departmentDao.get(2);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(7);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(6);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Wednesday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(5);
        timeTable.setStartTime(time);

        time =timeDao.get(9);
        timeTable.setEndTime(time);

        course =courseDao.get(17);
        timeTable.setCourse(course);

        department = departmentDao.get(2);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(8);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(7);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Thursday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(1);
        timeTable.setStartTime(time);

        time =timeDao.get(5);
        timeTable.setEndTime(time);

        course =courseDao.get(18);
        timeTable.setCourse(course);

        department = departmentDao.get(2);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(6);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(6);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Thursday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(5);
        timeTable.setStartTime(time);

        time =timeDao.get(9);
        timeTable.setEndTime(time);

        course =courseDao.get(19);
        timeTable.setCourse(course);

        department = departmentDao.get(2);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(7);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(7);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Thursday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(11);
        timeTable.setStartTime(time);

        time =timeDao.get(15);
        timeTable.setEndTime(time);

        course =courseDao.get(20);
        timeTable.setCourse(course);

        department = departmentDao.get(2);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(8);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(6);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));



        timeTable = new TimeTable();

        timeTable.setDay("Friday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(1);
        timeTable.setStartTime(time);

        time =timeDao.get(5);
        timeTable.setEndTime(time);

        course =courseDao.get(21);
        timeTable.setCourse(course);

        department = departmentDao.get(2);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(6);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(7);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));

        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Friday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(5);
        timeTable.setStartTime(time);

        time =timeDao.get(9);
        timeTable.setEndTime(time);

        course =courseDao.get(22);
        timeTable.setCourse(course);

        department = departmentDao.get(2);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(7);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(6);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


       // assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));

        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));



        timeTable = new TimeTable();

        timeTable.setDay("Friday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(11);
        timeTable.setStartTime(time);

        time =timeDao.get(15);
        timeTable.setEndTime(time);

        course =courseDao.get(23);
        timeTable.setCourse(course);

        department = departmentDao.get(2);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(8);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(7);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(2);
        timeTable.setSemester(semester);


       // assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));

        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));



        timeTable = new TimeTable();

        timeTable.setDay("Monday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(5);
        timeTable.setStartTime(time);

        time =timeDao.get(9);
        timeTable.setEndTime(time);

        course =courseDao.get(24);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(9);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(2);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(1);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Monday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(15);
        timeTable.setStartTime(time);

        time =timeDao.get(19);
        timeTable.setEndTime(time);

        course =courseDao.get(25);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(3);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(2);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(1);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));

        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Tuesday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(1);
        timeTable.setStartTime(time);

        time =timeDao.get(5);
        timeTable.setEndTime(time);

        course =courseDao.get(26);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(3);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(2);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(1);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));




        timeTable = new TimeTable();

        timeTable.setDay("Tuesday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(5);
        timeTable.setStartTime(time);

        time =timeDao.get(9);
        timeTable.setEndTime(time);

        course =courseDao.get(27);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(4);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(1);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(1);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));





        timeTable = new TimeTable();

        timeTable.setDay("Tuesday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(11);
        timeTable.setStartTime(time);

        time =timeDao.get(15);
        timeTable.setEndTime(time);

        course =courseDao.get(28);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(3);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(4);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(1);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));

        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));

        timeTable = new TimeTable();

        timeTable.setDay("Tuesday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(15);
        timeTable.setStartTime(time);

        time =timeDao.get(19);
        timeTable.setEndTime(time);

        course =courseDao.get(25);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(3);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(1);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(1);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));

        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));


        timeTable = new TimeTable();

        timeTable.setDay("Wednesday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(15);
        timeTable.setStartTime(time);

        time =timeDao.get(19);
        timeTable.setEndTime(time);

        course =courseDao.get(27);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(4);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(1);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(1);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));






        timeTable = new TimeTable();

        timeTable.setDay("Thursday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(1);
        timeTable.setStartTime(time);

        time =timeDao.get(5);
        timeTable.setEndTime(time);

        course =courseDao.get(29);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(4);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(4);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(1);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));






        timeTable = new TimeTable();

        timeTable.setDay("Thursday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(11);
        timeTable.setStartTime(time);

        time =timeDao.get(15);
        timeTable.setEndTime(time);

        course =courseDao.get(30);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(2);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(4);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(1);
        timeTable.setSemester(semester);


        //assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));



        timeTable = new TimeTable();

        timeTable.setDay("Friday");
        timeTable.setActive(true);
        timeTable.setState("old");

        time =timeDao.get(5);
        timeTable.setStartTime(time);

        time =timeDao.get(9);
        timeTable.setEndTime(time);

        course =courseDao.get(25);
        timeTable.setCourse(course);

        department = departmentDao.get(1);
        timeTable.setDepartment(department);

        lecture = lectureDao.get(3);
        timeTable.setLecture(lecture);

        lectureHall = lectureHallDao.get(1);
        timeTable.setLectureHall(lectureHall);

        semester = semesterDao.get(1);
        timeTable.setSemester(semester);


       // assertEquals("Added successfully", true,timeTableDao.updateTimeTableActive("Wednesday",2));
        assertEquals("Added successfully", true,timeTableDao.addTimeTable(timeTable));











    }
}
