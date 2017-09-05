package com.tk.my_spring_boot_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create By Bridge On 2017/9/5
 * Function:
 * Description:
 */

@RestController
public class MySpringBootDemoController {

    /**
     *
     */

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello Spring Boot";
    }
}
