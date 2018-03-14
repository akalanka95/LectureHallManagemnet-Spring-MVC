package com.akalanka.coursemanagement.test;


import com.akalanka.coursemanagement.backend.dao.CourseDao;
//import com.akalanka.coursemanagement.backend.dao.DepartmentDao;
import com.akalanka.coursemanagement.backend.dao.DepartmentDao;
import com.akalanka.coursemanagement.backend.dao.LectureDao;
import com.akalanka.coursemanagement.backend.dao.SemesterDao;
import com.akalanka.coursemanagement.backend.dto.Course;
//import com.akalanka.coursemanagement.backend.dto.Department;
import com.akalanka.coursemanagement.backend.dto.Department;
import com.akalanka.coursemanagement.backend.dto.Lecture;
import com.akalanka.coursemanagement.backend.dto.Semester;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class CourseTestCase {

    private static AnnotationConfigApplicationContext context;
    private static DepartmentDao departmentDao;
    private static CourseDao courseDao;
    private static LectureDao lectureDao;
    private static SemesterDao semesterDao;

    private Course course;
    private Department department;
    private Lecture lecture;
    private Semester semester;



    @BeforeClass
    public static void init() {
        context = new AnnotationConfigApplicationContext();
        context.scan("com.akalanka.coursemanagement");
        context.refresh();
        courseDao = (CourseDao) context.getBean("courseDao");
        lectureDao = (LectureDao) context.getBean("lectureDao");
        departmentDao = (DepartmentDao) context.getBean("departmentDao");
        semesterDao = (SemesterDao) context.getBean("semesterDao");

    }

    @Test
    public void addCourse() {

       /* course = new Course();

        course.setCourseCode("ISS0021");
        course.setCourseName("Emergency Technology");
        course.setDescription("This is regarding sstem intergation");
        course.setYear(2);

        department = departmentDao.get(1);
        course.setDepartment(department);

        lecture = lectureDao.get(1);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));*/


        course = new Course();

        course.setCourseCode("IS22222");
        course.setCourseName("System Intergration and Architecture");
        course.setDescription("This is regarding system intergation");
        course.setYear(2);

        department = departmentDao.get(1);
        course.setDepartment(department);

        lecture = lectureDao.get(4);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));



        course = new Course();

        course.setCourseCode("IS22221");
        course.setCourseName("Operating Systems");
        course.setDescription("This is regarding Operating System");
        course.setYear(2);

        department = departmentDao.get(1);
        course.setDepartment(department);

        lecture = lectureDao.get(3);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));



        course = new Course();

        course.setCourseCode("CPE2201");
        course.setCourseName("Professional English IV");
        course.setDescription("This is regarding English language");
        course.setYear(2);

        department = departmentDao.get(1);
        course.setDepartment(department);

        lecture = lectureDao.get(9);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("IS22223");
        course.setCourseName("IS Risk Management");
        course.setDescription("This is regarding IS Risk Management ");
        course.setYear(2);

        department = departmentDao.get(1);
        course.setDepartment(department);

        lecture = lectureDao.get(2);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("IS22226");
        course.setCourseName("Web Technologies");
        course.setDescription("This is regarding Web Technologies ");
        course.setYear(2);

        department = departmentDao.get(1);
        course.setDepartment(department);

        lecture = lectureDao.get(1);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("IS22220");
        course.setCourseName("System Administration and Maintenance");
        course.setDescription("This is regarding System Administration and Maintenance ");
        course.setYear(2);

        department = departmentDao.get(1);
        course.setDepartment(department);

        lecture = lectureDao.get(5);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("IS22224");
        course.setCourseName("IT Governance");
        course.setDescription("This is regarding IT Governance");
        course.setYear(2);

        department = departmentDao.get(1);
        course.setDepartment(department);

        lecture = lectureDao.get(3);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("IS22225");
        course.setCourseName("Business Intelligence");
        course.setDescription("This is regarding Business Intelligence");
        course.setYear(2);

        department = departmentDao.get(1);
        course.setDepartment(department);

        lecture = lectureDao.get(1);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("PST22112");
        course.setCourseName("Leadership and Communication");
        course.setDescription("This is regarding Leadership and Communication");
        course.setYear(2);

        department = departmentDao.get(2);
        course.setDepartment(department);

        lecture = lectureDao.get(6);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));



        course = new Course();

        course.setCourseCode("PST22201");
        course.setCourseName("Physics of Electromagnetic Radiation and Introduction to the Laser");
        course.setDescription("This is regarding Physics of Electromagnetic Radiation and Introduction to the Laser");
        course.setYear(2);

        department = departmentDao.get(2);
        course.setDepartment(department);

        lecture = lectureDao.get(7);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));





        course = new Course();

        course.setCourseCode("PST22114");
        course.setCourseName("Soft Kill Development");
        course.setDescription("This is regarding Soft Kill Development");
        course.setYear(2);

        department = departmentDao.get(2);
        course.setDepartment(department);

        lecture = lectureDao.get(8);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));



        course = new Course();

        course.setCourseCode("CPE2201");
        course.setCourseName("Professional English IV");
        course.setDescription("This is regarding Professional English IV");
        course.setYear(2);

        department = departmentDao.get(2);
        course.setDepartment(department);

        lecture = lectureDao.get(9);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("CPE22215");
        course.setCourseName("Mathematical Methods");
        course.setDescription("This is regarding Mathematical Methods");
        course.setYear(2);

        department = departmentDao.get(2);
        course.setDepartment(department);

        lecture = lectureDao.get(8);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("PST22211");
        course.setCourseName("Operating Systems");
        course.setDescription("This is regarding Operating Systems");
        course.setYear(2);

        department = departmentDao.get(2);
        course.setDepartment(department);

        lecture = lectureDao.get(3);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("PST22106");
        course.setCourseName("Inorganic Chemistry");
        course.setDescription("This is regarding Inorganic Chemistry");
        course.setYear(2);

        department = departmentDao.get(2);
        course.setDepartment(department);

        lecture = lectureDao.get(6);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("PST22202");
        course.setCourseName("Quantun Physics, Atomic & Nuclear Physics");
        course.setDescription("This is regarding Quantun Physics, Atomic & Nuclear Physics");
        course.setYear(2);

        department = departmentDao.get(2);
        course.setDepartment(department);

        lecture = lectureDao.get(7);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("PST22209");
        course.setCourseName("Advanced Statistics II");
        course.setDescription("This is regarding Advanced Statistics II");
        course.setYear(2);

        department = departmentDao.get(2);
        course.setDepartment(department);

        lecture = lectureDao.get(8);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));



        course = new Course();

        course.setCourseCode("PST22205");
        course.setCourseName("Physical Chemistry");
        course.setDescription("This is regarding Physical Chemistry");
        course.setYear(2);

        department = departmentDao.get(2);
        course.setDepartment(department);

        lecture = lectureDao.get(6);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("PST22207");
        course.setCourseName("Biochemistry I");
        course.setDescription("This is regarding Biochemistry");
        course.setYear(2);

        department = departmentDao.get(2);
        course.setDepartment(department);

        lecture = lectureDao.get(7);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("PST22110");
        course.setCourseName("Computer Laboratory");
        course.setDescription("This is regarding computer system");
        course.setYear(2);

        department = departmentDao.get(2);
        course.setDepartment(department);

        lecture = lectureDao.get(8);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("PST22204");
        course.setCourseName("Chemistry of Elements");
        course.setDescription("This is regarding Chemistry of Elements");
        course.setYear(2);

        department = departmentDao.get(2);
        course.setDepartment(department);

        lecture = lectureDao.get(6);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("PST22213");
        course.setCourseName("Biology for Physical Science");
        course.setDescription("This is regarding Biology for Physical Science");
        course.setYear(2);

        department = departmentDao.get(2);
        course.setDepartment(department);

        lecture = lectureDao.get(7);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("PST22208");
        course.setCourseName("Software Engineering");
        course.setDescription("This is regarding Software Engineering");
        course.setYear(2);

        department = departmentDao.get(2);
        course.setDepartment(department);

        lecture = lectureDao.get(8);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));



        course = new Course();

        course.setCourseCode("CPE1231");
        course.setCourseName("Professional English");
        course.setDescription("This is regarding Professional English");
        course.setYear(1);

        department = departmentDao.get(1);
        course.setDepartment(department);

        lecture = lectureDao.get(9);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));



        course = new Course();

        course.setCourseCode("IS12307");
        course.setCourseName("Object Oriented Programming");
        course.setDescription("This is regarding Object Oriented Programming");
        course.setYear(1);

        department = departmentDao.get(1);
        course.setDepartment(department);

        lecture = lectureDao.get(3);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("IS12308");
        course.setCourseName("Database Management System");
        course.setDescription("This is regarding Database Management System");
        course.setYear(1);

        department = departmentDao.get(1);
        course.setDepartment(department);

        lecture = lectureDao.get(3);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("IS12311");
        course.setCourseName("Analysis of Algorithms");
        course.setDescription("This is regarding Analysis of Algorithms");
        course.setYear(1);

        department = departmentDao.get(1);
        course.setDepartment(department);

        lecture = lectureDao.get(4);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("IS12312");
        course.setCourseName("Human Computer Interaction");
        course.setDescription("This is regarding Human Computer Interaction");
        course.setYear(1);

        department = departmentDao.get(1);
        course.setDepartment(department);

        lecture = lectureDao.get(3);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));





        course = new Course();

        course.setCourseCode("IS12309");
        course.setCourseName("Emerging Technologies for IS");
        course.setDescription("This is regarding Emerging Technologies for IS");
        course.setYear(1);

        department = departmentDao.get(1);
        course.setDepartment(department);

        lecture = lectureDao.get(4);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));




        course = new Course();

        course.setCourseCode("IS12210");
        course.setCourseName("Advanced Mathematics");
        course.setDescription("This is regarding Advanced Mathematics");
        course.setYear(1);

        department = departmentDao.get(1);
        course.setDepartment(department);

        lecture = lectureDao.get(2);
        course.setLecture(lecture);

        semester = semesterDao.get(2);
        course.setSemester(semester);

        assertEquals("Added successfully", true, courseDao.addCourse(course));






    }
}

