package com.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-22 11:43
 **/
public class MyAppContainerInitializerImpl implements MyAppContainerInitializer {
    @Override
    public void a(ServletContext context) {
        ServletRegistration.Dynamic servletRegistration = context.addServlet("second",new SecondServlet());
        servletRegistration.addMapping("/second");
    }
}
