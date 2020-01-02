package com.feign.controller;

import com.feign.client.HelloCilent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFeignController {
    @Autowired
    HelloCilent helloCilent;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return helloCilent.sayHelloService( name );
    }
}
