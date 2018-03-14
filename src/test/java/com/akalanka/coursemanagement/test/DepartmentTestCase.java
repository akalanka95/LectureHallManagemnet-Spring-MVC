package com.akalanka.coursemanagement.test;

import com.akalanka.coursemanagement.backend.dao.DepartmentDao;
import com.akalanka.coursemanagement.backend.dto.Department;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class DepartmentTestCase {

    private static AnnotationConfigApplicationContext context;

    private static DepartmentDao departmentDao;

    private Department department;

    @BeforeClass
    public static void init() {
        context = new AnnotationConfigApplicationContext();
        context.scan("com.akalanka.coursemanagement");
        context.refresh();
        departmentDao = (DepartmentDao) context.getBean("departmentDao");

    }

    @Test
    public void addDepartment() {

        /*department = new Department();

        department.setActive(true);
        department.setDepartmentName("Computing and Information System(CIS)");
        department.setDescription("This department is regarding computer science ");


        assertEquals("Added successfully", true, departmentDao.addDepartment(department));

        department = new Department();

        department.setActive(true);
        department.setDepartmentName("Sport Science");
        department.setDescription("This department is regarding sport science ");
        assertEquals("Added successfully", true, departmentDao.addDepartment(department));


        department = new Department();

        department.setActive(true);
        department.setDepartmentName("Physical Science And Technology");
        department.setDescription("THis department is regarding physical science ");
        assertEquals("Added successfully", true, departmentDao.addDepartment(department));

       //assertEquals("sucess",0 ,departmentDao.getDepartmentList().size());

*/

        department = new Department();

        department.setActive(true);
        department.setDepartmentName("Computing and Information System(CIS)");
        department.setDescription(" The degree program has been designed so that the graduates could cater to the growing demand in government and private sector. ");


        assertEquals("Added successfully", true, departmentDao.addDepartment(department));

        department = new Department();

        department.setActive(true);
        department.setDepartmentName("Physical Science And Technology");
        department.setDescription(" Four degree programmes are available for the undergraduates and Mathematics, Statistics, and Management Studies are conducted as supporting tools for the program. ");
        assertEquals("Added successfully", true, departmentDao.addDepartment(department));


        department = new Department();

        department.setActive(true);
        department.setDepartmentName("Sport Sciences and Physical Education");
        department.setDescription("The duration of the degree programmes are four years and at present there is a great demand for the degree programme");
        assertEquals("Added successfully", true, departmentDao.addDepartment(department));


        department = new Department();

        department.setActive(true);
        department.setDepartmentName("Natural Resources");
        department.setDescription("The degree program is designed to cater to the current job market in the fields of Environmental Protection, Natural Resource Management and Conservation, Biodiversity Conservation and Management.");
        assertEquals("Added successfully", true, departmentDao.addDepartment(department));


        department = new Department();

        department.setActive(true);
        department.setDepartmentName("Food Science and Technology");
        department.setDescription(" Degree program is designed to expand the understanding of the biological, microbiological, chemical, physical, sensory, nutritional, and engineering properties of food/ food commodities and their processing technologies.");
        assertEquals("Added successfully", true, departmentDao.addDepartment(department));






    }
}
