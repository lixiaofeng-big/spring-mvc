package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-22 15:28
 **/
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
