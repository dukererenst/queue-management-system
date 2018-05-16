package com.assignment.service;

import com.assignment.dao.AdminDao;
import com.assignment.model.Counter;
import com.assignment.model.Services;
import org.dom4j.Branch;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminDao adminDao;

    @Override
    public Branch registerBranch(Branch branch) throws Exception {
        return adminDao.registerBranch(branch);
    }

    @Override
    public Counter registerCounter(Counter counter) throws Exception {
        return adminDao.registerCounter(counter);
    }

    @Override
    public Services registerServices(Services services) throws Exception {
        return adminDao.registerServices(services);
    }
}
