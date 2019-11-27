package com.forward;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-14 11:41
 **/
@Controller
public class ForwardController {

   /* @RequestMapping("/demo")
    public ModelAndView demo(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data","这里是data的数据");
        modelAndView.setViewName("index");
        return modelAndView;
    }*/
    @RequestMapping("/demo")
    public String demo(Model model){
        model.addAttribute("data","这里是data的数据");
        return "index";
    }

    @RequestMapping("/test")
    public void demo2(HttpServletResponse response) throws IOException {
        Gson gson = new Gson();
        String a = "aaaaa";
        String json = gson.toJson(a);
        response.getWriter().print(json);

    }

}
