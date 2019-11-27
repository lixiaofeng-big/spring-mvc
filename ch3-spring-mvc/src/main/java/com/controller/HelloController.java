package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-11 10:32
 **/
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String handler(Integer a){
        System.out.println("a = " + a);
        return "index";
    }

    @RequestMapping("/index2")
    public String handler2(@RequestParam(name = "num",required = false,defaultValue = "5") int a){
        System.out.println("a = " + a);
        return "index";
    }

    @RequestMapping("/index3/{page}")
    public String handler3(@PathVariable("page") int page){
        System.out.println("a = " + page);
        return "index";
    }
}
