package com.service;

import com.dao.DeptDao;
import com.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-25 11:32
 **/
@Service
public class DeptService {
    @Autowired
    private DeptDao deptDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    public void delete(int id){
        employeeDao.delete(id);
        deptDao.delete(id);
    }
}
