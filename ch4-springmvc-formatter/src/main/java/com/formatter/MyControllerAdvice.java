package com.formatter;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-13 07:34
 **/

public class MyControllerAdvice {

    @InitBinder
    public void formatter(WebDataBinder webDataBinder){
        webDataBinder.addCustomFormatter(new MyFormatter());
        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.setPattern("yyyy-MM-dd");
        webDataBinder.addCustomFormatter(dateFormatter);
    }

}
