package com.akalanka.coursemanagement.backend.daoImp;

import com.akalanka.coursemanagement.backend.dao.DepartmentDao;
import com.akalanka.coursemanagement.backend.dto.Department;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;


@Repository("departmentDao")
@Transactional
public class DepartmentDaoImp implements DepartmentDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean addDepartment(Department department) {
        try {
            sessionFactory.getCurrentSession().persist(department);
            return true;
        }catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    @Override
    public Department get(int id) {
        return sessionFactory.getCurrentSession().get(Department.class, Integer.valueOf(id));
    }

    @Override
    public List<Department> getDepartmentList() {
        String selectDepartmentList = "From Department ";
        Query query = sessionFactory.getCurrentSession().createQuery(selectDepartmentList);
        return query.getResultList();
    }

    @Override
    public List<Department> getlist(int id) {
        String selectDepartmentList = "From Department WHERE id= :id ";
        Query query = sessionFactory.getCurrentSession().createQuery(selectDepartmentList);
        query.setParameter("id",id);
        return query.getResultList();
    }

}
