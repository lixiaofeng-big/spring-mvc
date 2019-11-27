package com.controller;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Set;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-22 11:33
 **/
public class MyServletContextInit implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println(set);
        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("first",new FirstServlet());
        servletRegistration.addMapping("/first");
    }
}
