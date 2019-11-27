package com.controller;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-22 11:39
 **/
@HandlesTypes(MyAppContainerInitializer.class)
public class SecondServletContainerInit implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> clzs, ServletContext servletContext) throws ServletException {
        for (Class<?> clz : clzs) {
            if (MyAppContainerInitializer.class.isAssignableFrom(clz)){
                try {
                    MyAppContainerInitializer myAppContainerInitializer = (MyAppContainerInitializer) clz.newInstance();
                    myAppContainerInitializer.a(servletContext);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
