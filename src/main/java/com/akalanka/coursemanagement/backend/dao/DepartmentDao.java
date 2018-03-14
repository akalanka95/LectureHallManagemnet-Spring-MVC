package com.akalanka.coursemanagement.backend.dao;


import com.akalanka.coursemanagement.backend.dto.Department;

import java.util.List;

public interface DepartmentDao {

    boolean addDepartment(Department department);
    Department get(int id);
    List<Department> getDepartmentList();
    List<Department> getlist(int id);
}
