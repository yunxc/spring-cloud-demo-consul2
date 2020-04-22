package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    /*@RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }*/

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        System.out.println("服务调用成功--------" + name);
        return "hello consul " + name;
    }
}