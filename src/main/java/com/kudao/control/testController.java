package com.kudao.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/test")
    public Object test(){

        return "github 测试成功完美!";

    }

}
