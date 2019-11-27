package com.controller;

import com.entity.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-25 11:36
 **/
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Employee> list(@RequestParam(required = false,defaultValue = "1") int pageNum,@RequestParam(required = false,defaultValue = "3") int pageSize){
        List<Employee> employees = employeeService.getDataByPage(pageNum, pageSize);
        return employees;
    }

}
