package com.akalanka.coursemanagement.test;

import com.akalanka.coursemanagement.backend.dao.DepartmentDao;
import com.akalanka.coursemanagement.backend.dao.LectureDao;
import com.akalanka.coursemanagement.backend.dto.Department;
import com.akalanka.coursemanagement.backend.dto.Lecture;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class LectureTestcase {

    private static AnnotationConfigApplicationContext context;

    private static  LectureDao lectureDao;
    private static DepartmentDao departmentDao;

    private Lecture lecture;
    private Department department;

    @BeforeClass
    public static void init() {
        context = new AnnotationConfigApplicationContext();
        context.scan("com.akalanka.coursemanagement");
        context.refresh();
        lectureDao = (LectureDao) context.getBean("lectureDao");

    }

    @Test
    public void addLecture(){

        /*lecture = new Lecture();

        lecture.setAddress("kurunegala");
        lecture.setContact("+9470223540");

        department = departmentDao.get(1);

        lecture.setDepartment(department);
        lecture.setEmail("pulasthi@gmail.com");
        lecture.setFullName("Pulasthi");
        lecture.setActive(true);


        assertEquals("Failed to add cart",true,lectureDao.addLecture(lecture));

        lecture = new Lecture();

        lecture.setAddress("Badulla");
        lecture.setContact("0712260878");
        lecture.setDepartment(2);
        lecture.setEmail("Malith@gmail.com");
        lecture.setFullName("Malitha");


        assertEquals("Failed to add cart",true,lectureDao.addLecture(lecture));*/



        lecture = new Lecture();

        lecture.setAddress("kandy");
        lecture.setContact("+94714431192");
        department = departmentDao.get(1);
        lecture.setDepartment(department);
        lecture.setEmail("kumara@appsc.sab.ac.lk");
        lecture.setFullName("Dr.B.T.G.S.Kumara");
        lecture.setRole("Head of the department");
        lecture.setActive(true);


        assertEquals("Failed to add cart",true,lectureDao.addLecture(lecture));


        lecture = new Lecture();

        lecture.setAddress("Colombo");
        lecture.setContact("+94717851500");
        department = departmentDao.get(1);
        lecture.setDepartment(department);
        lecture.setEmail("priyan@appsc.sab.ac.lk");
        lecture.setFullName("Mr.S.Vasanthapriyan");
        lecture.setRole("Senior Lecturer");
        lecture.setActive(true);

        assertEquals("Failed to add cart",true,lectureDao.addLecture(lecture));


        lecture = new Lecture();

        lecture.setAddress("Ampara");
        lecture.setContact("+94718080883");
        department = departmentDao.get(1);
        lecture.setDepartment(department);
        lecture.setEmail("rk@appsc.sab.ac.lk");
        lecture.setFullName("Mr.R.K.A.R.Kariapper");
        lecture.setRole("Senior Lecturer");
        lecture.setActive(true);

        assertEquals("Failed to add cart",true,lectureDao.addLecture(lecture));


        lecture = new Lecture();

        lecture.setAddress("Gampaha");
        lecture.setContact("+94453454519");
        department = departmentDao.get(1);
        lecture.setDepartment(department);
        lecture.setEmail("sugeeswarilekamge@appsc.sab.ac.lk");
        lecture.setFullName("Mrs.Sugeeswari Lekamge");
        lecture.setRole("Lecturer");
        lecture.setActive(true);

        assertEquals("Failed to add cart",true,lectureDao.addLecture(lecture));


        lecture = new Lecture();

        lecture.setAddress("Ratnapura");
        lecture.setContact("+94453454519");
        department = departmentDao.get(1);
        lecture.setDepartment(department);
        lecture.setEmail("ravindra.dangalla@appsc.sab.ac.lk");
        lecture.setFullName("Mr.R.L.Dangalla");
        lecture.setRole("Lecturer");
        lecture.setActive(true);

        assertEquals("Failed to add cart",true,lectureDao.addLecture(lecture));


        lecture = new Lecture();

        lecture.setAddress("Ratnapura");
        lecture.setContact("+94453454527");
        department = departmentDao.get(2);
        lecture.setDepartment(department);
        lecture.setEmail("jatalathek@appsc.sab.ac.lk");
        lecture.setFullName("Mr.Jayalath B.Ekanayake");
        lecture.setRole("Head of the department");
        lecture.setActive(true);

        assertEquals("Failed to add cart",true,lectureDao.addLecture(lecture));


        lecture = new Lecture();

        lecture.setAddress("colombo");
        lecture.setContact("+94453454527");
        department = departmentDao.get(2);
        lecture.setDepartment(department);
        lecture.setEmail("nirmaliw@appsc.sab.ac.lk");
        lecture.setFullName("Dr.M.Nirmali Wicramaratne");
        lecture.setRole("Senior Lecturer");
        lecture.setActive(true);

        assertEquals("Failed to add cart",true,lectureDao.addLecture(lecture));


        lecture = new Lecture();

        lecture.setAddress("Kurunegala");
        lecture.setContact("+94714433425");
        department = departmentDao.get(2);
        lecture.setDepartment(department);
        lecture.setEmail("malavisarath@appsc.sab.ac.lk");
        lecture.setFullName("Mr.S.Malavipathirana");
        lecture.setRole("Lecturer");
        lecture.setActive(true);

        assertEquals("Failed to add cart",true,lectureDao.addLecture(lecture));



        lecture = new Lecture();

        lecture.setAddress("Kurunegala");
        lecture.setContact("+9471443342");
        department = departmentDao.get(1);
        lecture.setDepartment(department);
        lecture.setEmail("prasangani@appsc.sab.ac.lk");
        lecture.setFullName("Dr.K.R.S.N.Prasangani");
        lecture.setRole("Lecturer");
        lecture.setActive(true);

        assertEquals("Failed to add cart",true,lectureDao.addLecture(lecture));

    }

    @Test
    public void updateLecture(){
           lecture = lectureDao.get(1);

            lecture.setFullName("gamage");

            assertEquals("sucess",true,lectureDao.updateLecture(lecture));
            //assertEquals("sucess",true,lectureDao.deleteLecture(lecture));
           assertEquals("sucess",10 ,lectureDao.lectureList().size());

    }

}
