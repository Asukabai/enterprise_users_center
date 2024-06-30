package com.ss.center;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ss.center.mapper")
public class CenterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CenterDemoApplication.class, args);
    }
}
