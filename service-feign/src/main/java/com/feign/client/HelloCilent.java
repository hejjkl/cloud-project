package com.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="service-hi")
public interface HelloCilent {
    @RequestMapping(path = "/hi",method = RequestMethod.GET)
    String sayHelloService(@RequestParam(value="name")String name);
}
