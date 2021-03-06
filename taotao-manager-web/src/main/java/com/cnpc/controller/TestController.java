package com.cnpc.controller;

import com.cnpc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public String getTime() {
        return testService.getTime();
    }

}
