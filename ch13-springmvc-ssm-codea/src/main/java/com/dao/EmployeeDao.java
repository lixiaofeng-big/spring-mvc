package com.dao;

import com.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-25 11:09
 **/
public interface EmployeeDao {
    List<Employee> getDataByPage(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    void delete(int did);
}
