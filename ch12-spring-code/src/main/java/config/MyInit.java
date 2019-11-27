package config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-22 15:17
 **/
/*public class MyInit implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext configWebApplicationContext =
                new AnnotationConfigWebApplicationContext();
        configWebApplicationContext.register(MyConfig.class);
        DispatcherServlet dispatcherServlet = new DispatcherServlet(configWebApplicationContext);
        ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("hello", dispatcherServlet);
        servletRegistration.addMapping("/");
    }
}*/
