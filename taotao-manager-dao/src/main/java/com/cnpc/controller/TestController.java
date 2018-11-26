package com.cnpc.controller;


import com.cnpc.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestDao testDao;

    @RequestMapping("test")
    public String test(@RequestParam String name){
        System.out.print(name);
        return testDao.getTime();
    }

}
