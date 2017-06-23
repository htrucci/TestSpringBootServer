package com.htrucci.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 201410089 on 2017-05-19.
 */
@Controller
@EnableAutoConfiguration
public class TestController{

    @ResponseBody
    @RequestMapping(value ="/")
    public ModelAndView root(){
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }

    @RequestMapping(value="/hello")
    public String newPost(Model model){
        model.addAttribute("name","황교빈");
        return "new";
    }

    @RequestMapping(value="/blog")
    public String blog(Model model){
        System.out.println("/blog");
        return "blog";
    }

}

