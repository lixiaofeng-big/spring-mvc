package com.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-12 11:46
 **/
public class MyFormatter implements Formatter<Emp> {
    @Override
    public Emp parse(String text, Locale locale) throws ParseException {
        String[] split = text.split(",");
        Emp emp = new Emp();
        emp.setFirstName(split[0]);
        emp.setLastName(split[1]);
        return emp;
    }

    @Override
    public String print(Emp object, Locale locale) {
        return null;
    }
}
