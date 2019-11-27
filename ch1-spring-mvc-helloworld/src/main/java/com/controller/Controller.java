package com.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-07 19:10
 **/
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("")
    public String handler(){
        System.out.println("这里是index----------");
        return "hello";
    }

    @RequestMapping("/3")
    public Object handler3(){
        Hello hello = new Hello();
        hello.setString("aaa");
        return hello;
    }

    @RequestMapping("/index2")
    public ModelAndView handler2(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("a","hello world");
        return modelAndView;
    }
}
