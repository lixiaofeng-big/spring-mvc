package com.controller;

import com.entity.EmpEntity;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-13 11:11
 **/
@Controller
public class ValidationController {

    @InitBinder
    public void a(WebDataBinder binder){
        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.setPattern("yyyy-MM-dd");
        binder.addCustomFormatter(dateFormatter);
    }

    @RequestMapping("/aa")
    public ModelAndView handler(String a){
        System.out.println("a = " + a);
        ModelAndView view = new ModelAndView();
        view.setViewName("index");
        return view;
    }


    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/insert")
    public ModelAndView handler2(@Valid EmpEntity empEntity, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
           List<FieldError> errors = bindingResult.getFieldErrors();
            for (FieldError error : errors) {
                System.out.println("--------");
                System.out.println(error.getField()+"----"+error.getDefaultMessage());
            }
        }
        System.out.println("empEntity = " + empEntity);
        ModelAndView view = new ModelAndView();
        view.setViewName("index");
        return view;
    }
}
