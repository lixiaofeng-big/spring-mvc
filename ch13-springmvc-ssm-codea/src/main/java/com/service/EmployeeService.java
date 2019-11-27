package com.service;

import com.dao.EmployeeDao;
import com.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-25 11:26
 **/
@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> getDataByPage(int pageNum,int pageSize){
        return employeeDao.getDataByPage(pageNum, pageSize);
    }
}
