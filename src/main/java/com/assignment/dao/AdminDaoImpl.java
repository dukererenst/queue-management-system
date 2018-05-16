package com.assignment.dao;

import com.assignment.model.Counter;
import com.assignment.model.Services;
import com.assignment.utils.HibernateUtil;
import org.dom4j.Branch;
import org.hibernate.Session;

public class AdminDaoImpl implements AdminDao {

    @Override
    public Branch registerBranch(Branch branch) throws Exception {
        try(Session session = HibernateUtil.getSession()) {
            session.getTransaction().begin();
            session.save(branch);
            session.getTransaction().commit();
        }
        return branch;
    }

    @Override
    public Counter registerCounter(Counter counter) throws Exception {
        try(Session session = HibernateUtil.getSession()) {
            session.getTransaction().begin();
            session.save(counter);
            session.getTransaction().commit();
        }
        return counter;
    }

    @Override
    public Services registerServices(Services services) throws Exception {
        try(Session session = HibernateUtil.getSession()) {
            session.getTransaction().begin();
            session.save(services);
            session.getTransaction().commit();
        }
        return services;
    }
}
