package com.neo.clientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 * @date 2020/4/21 10:16
 */
@Service
@FeignClient(value = "service-producer")
public interface IntegralClientService {

    /**
     * 调用远程服务
     * @param name
     * @return
     */
    @PostMapping(value = {"/hello"})
    String hello(@RequestParam("name") String name);

}
