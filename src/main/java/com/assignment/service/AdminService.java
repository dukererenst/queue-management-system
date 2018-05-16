package com.assignment.service;

import com.assignment.model.Counter;
import com.assignment.model.Services;
import org.dom4j.Branch;

public interface AdminService {


    public Branch registerBranch(Branch branch)throws Exception;

    public Counter registerCounter(Counter counter)throws Exception;

    public Services registerServices(Services services)throws Exception;
}
