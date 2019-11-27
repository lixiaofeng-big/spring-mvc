package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-15 15:43
 **/
@Controller
public class ShowController {

    @RequestMapping("/demo")
    public String demo(){
        return "index";
    }
}
