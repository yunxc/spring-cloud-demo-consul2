package com.neo.controller;

import com.neo.clientservice.IntegralClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2020/4/21 10:21
 */
@RestController
public class FeignClientTestController {

    @Autowired
    private IntegralClientService integralClientService;

    @RequestMapping("/testFeignClient")
    public Object testFeignClient(String name) {
        System.out.println("testFeignClient " + name);
        return integralClientService.hello(name);
    }

}
