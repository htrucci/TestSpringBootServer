package com.htrucci.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
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
}

