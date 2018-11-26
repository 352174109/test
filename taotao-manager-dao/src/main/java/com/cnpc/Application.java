package com.cnpc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.cnpc.dao")
public class Application {

    public static void main(String[] ags) {
        SpringApplication.run(Application.class, ags);
    }

}
