package com.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-14 11:11
 **/
@Controller
@RequestMapping("/a")
public class ViewController {
    @RequestMapping("/index")
    public RedirectView demo(){
        RedirectView redirectView = new RedirectView("show");
        return redirectView;
    }
    @RequestMapping("/show")
    public String show(){
        return "index";
    }

    @RequestMapping("/demo")
    public String demo2(){
        return "forward:index"; //index.jsp
    }
}
