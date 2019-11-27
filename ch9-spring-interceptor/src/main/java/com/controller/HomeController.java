package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-20 09:08
 **/
@Controller
public class HomeController {
    //请求这个方法谁都可以访问
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/show")
    public String show(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(String name, String password, HttpSession session){
        System.out.println(name +"" + password);
        if (name.equals("admin") && password.equals("123456")){
            session.setAttribute("name",name);
            return "forward:show";
        }else {
            return "login";
        }
    }
}
