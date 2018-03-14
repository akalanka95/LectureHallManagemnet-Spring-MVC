package com.akalanka.coursemanagement.backend.dao;

import com.akalanka.coursemanagement.backend.dto.DepartmentRef;

import java.util.List;

public interface DepartmentRefDao {


    boolean addDepartmentRef(DepartmentRef departmentRef);
    boolean updateDepartmentRef(DepartmentRef departmentRef);
    boolean deleteDepartmentRef(DepartmentRef departmentRef);
    DepartmentRef get(int id);
    DepartmentRef getDepartmentrefsemdep(int depid,int semid);


    List<DepartmentRef> departmentRefList();
}
