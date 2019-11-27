package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-11 10:32
 **/
@Controller
@RequestMapping("/second")
public class HelloController2 {

    @GetMapping("/index")
    public String handler(){
        return "index";
    }

    @PutMapping("/index")
    public String handler2(){

        return "index2";
    }

    @DeleteMapping("/index")
    public String handler3(){
        return "index2";
    }
    @PostMapping("/index")
    public String handler4(){
        return "index";
    }

}
