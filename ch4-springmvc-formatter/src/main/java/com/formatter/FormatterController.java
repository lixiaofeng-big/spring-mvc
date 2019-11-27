package com.formatter;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-12 11:27
 **/
@Controller
public class FormatterController {

    @InitBinder
    public void formatter(WebDataBinder webDataBinder){
        webDataBinder.addCustomFormatter(new MyFormatter());
        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.setPattern("yyyy/MM/dd");
        webDataBinder.addCustomFormatter(dateFormatter);

    }

   /* @InitBinder
    public void formatter(WebDataBinder webDataBinder){
        webDataBinder.addCustomFormatter(new MyFormatter());
        webDataBinder.addCustomFormatter(new DateFormatter());

    }*/


    @RequestMapping("/index")
    public String receiveDate(@DateTimeFormat(pattern = "yyyy-MM-dd") Date date) throws ParseException {
        System.out.println("date1 = " + date);
        return "index";
    }

    @RequestMapping("/index2")
    public String receiveEmp(@RequestParam("xxx") Emp emp){
        System.out.println("emp = " + emp);
        return "index";
    }
}
