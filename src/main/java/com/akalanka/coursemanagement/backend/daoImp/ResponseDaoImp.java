package com.akalanka.coursemanagement.backend.daoImp;

import com.akalanka.coursemanagement.backend.dao.ResponseDao;
import com.akalanka.coursemanagement.backend.dto.Response;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Repository("responseDao")
@Transactional
public class ResponseDaoImp implements ResponseDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean addResponse(Response response) {
        try {
            sessionFactory.getCurrentSession().persist(response);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Response> getlastfive() {
        String selectresponse5List = "From Response WHERE state= 'received' ORDER BY id DESC";
        Query query = sessionFactory.getCurrentSession().createQuery(selectresponse5List );
        query.setFirstResult(0);
        query.setMaxResults(8);
        return query.getResultList();
    }

    @Override
    public List<Response> getallresponses() {
        String selectallresponseList = "From Response WHERE state= 'received' ";
        Query query = sessionFactory.getCurrentSession().createQuery(selectallresponseList );
        return query.getResultList();
    }

    @Override
    public Response getResponserecived(String code,String received) {
        String getreceived = "From Response WHERE state= :received AND code= :code";
        Query query = sessionFactory.getCurrentSession().createQuery(getreceived );
        query.setParameter("received",received);
        query.setParameter("code",code);
        return (Response) query.getSingleResult();
    }

    @Override
    public Response getResponsesent(String code, String sent) {
        String getsent = "From Response WHERE state= :sent AND code= :code";
        Query query = sessionFactory.getCurrentSession().createQuery(getsent);
        query.setParameter("sent",sent);
        query.setParameter("code",code);
        return (Response) query.getSingleResult();
    }
}
