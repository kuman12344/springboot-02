package com.kudao.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Springboot02 {
    @RequestMapping("/hello")
    @ResponseBody
    public String helloData(){
        return "欢迎来到springboot!";
    }
}
