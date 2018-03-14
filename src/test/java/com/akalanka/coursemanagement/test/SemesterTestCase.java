package com.akalanka.coursemanagement.test;


import com.akalanka.coursemanagement.backend.dao.SemesterDao;
import com.akalanka.coursemanagement.backend.dto.Semester;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.assertEquals;
public class SemesterTestCase {

    private static AnnotationConfigApplicationContext context;
    private static SemesterDao semesterDao;
    private Semester semester;


    @BeforeClass
    public static void init() {
        context = new AnnotationConfigApplicationContext();
        context.scan("com.akalanka.coursemanagement");
        context.refresh();
        semesterDao = (SemesterDao) context.getBean("semesterDao");
    }

    @Test
    public void addSemester() {

        semester = new Semester();

       semester.setSemesterName("Semester one");

        assertEquals("Added successfully", true, semesterDao.addSemester(semester));

        semester = new Semester();

        semester.setSemesterName("Semester two");

        assertEquals("Added successfully", true, semesterDao.addSemester(semester));

        semester = new Semester();

        semester.setSemesterName("Semester three");

        assertEquals("Added successfully", true, semesterDao.addSemester(semester));

        semester = new Semester();

        semester.setSemesterName("Semester four");

        assertEquals("Added successfully", true, semesterDao.addSemester(semester));


    }


    }
