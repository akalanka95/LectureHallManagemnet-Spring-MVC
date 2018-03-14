package com.akalanka.coursemanagement.backend.daoImp;

import com.akalanka.coursemanagement.backend.dao.DepartmentRefDao;
import com.akalanka.coursemanagement.backend.dto.DepartmentRef;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Repository("departmentRefDao")
@Transactional
public class DepartmentRefDaoImp implements DepartmentRefDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean addDepartmentRef(DepartmentRef departmentRef) {
        try {
            sessionFactory.getCurrentSession().persist(departmentRef);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateDepartmentRef(DepartmentRef departmentRef) {
        try {
            sessionFactory.getCurrentSession().update(departmentRef);
            return true;
        }catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteDepartmentRef(DepartmentRef departmentRef) {
        try {
            sessionFactory.getCurrentSession().delete(departmentRef);
            return true;
        }catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public DepartmentRef get(int id) {
        return sessionFactory.getCurrentSession().get(DepartmentRef.class, Integer.valueOf(id));
    }

    @Override
    public DepartmentRef getDepartmentrefsemdep(int depid, int semid) {
        String selectDepartmentRefList = "From DepartmentRef WHERE department= :depid AND semester= :semid AND active= :true";
        Query query = sessionFactory.getCurrentSession().createQuery(selectDepartmentRefList);
        query.setParameter("depid",depid);
        query.setParameter("semid",semid);
        query.setParameter("true",true);
        return (DepartmentRef)query.getSingleResult();
    }

    @Override
    public List<DepartmentRef> departmentRefList() {
        String selectDepartmentRefList = "From DepartmentRef ";
        Query query = sessionFactory.getCurrentSession().createQuery(selectDepartmentRefList);
        return query.getResultList();
    }
}
