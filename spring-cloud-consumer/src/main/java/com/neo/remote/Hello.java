package com.neo.remote;

//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yunlong.zhang
 * @date 2019/8/16 0:38
 */
//@FeignClient(name= "spring-cloud-producer1")
public interface Hello {

    @RequestMapping(value = "/hellocloud")
    public String hellocloud();
}
