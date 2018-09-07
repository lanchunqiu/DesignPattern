package com.lancq.structure_pattern.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/7
 **/
@SpringBootApplication
@RestController
public class DesignPatternDemosApplication extends WebMvcConfigurerAdapter {
    @GetMapping("")
    public String hello() {
        return "Hello,World";
    }

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternDemosApplication.class, args);
    }

}
