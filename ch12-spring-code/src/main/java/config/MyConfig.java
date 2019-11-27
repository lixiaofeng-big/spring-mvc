package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-22 15:21
 **/
@Configuration
@ComponentScan("com.controller")
@EnableWebMvc
public class MyConfig implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver resourceViewResolver(){
        InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
        resourceViewResolver.setSuffix(".jsp");
        resourceViewResolver.setPrefix("/WEB-INF/");
        return resourceViewResolver;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }
}
