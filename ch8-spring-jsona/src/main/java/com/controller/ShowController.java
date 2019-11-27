package com.controller;

import com.entity.Emp;
import org.springframework.format.Formatter;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-18 11:18
 **/
@RestController
public class ShowController {

    @InitBinder
    public void myBinder(WebDataBinder webDataBinder){
        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.setPattern("yyyy-MM-dd");
        webDataBinder.addCustomFormatter(dateFormatter);
    }

    @RequestMapping("/index")
    public Emp index(Emp emp){
        System.out.println(emp);
        return emp;
    }
}
