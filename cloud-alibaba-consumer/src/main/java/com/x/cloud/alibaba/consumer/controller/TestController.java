package com.x.cloud.alibaba.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: zjx
 * @Date: 2019/10/10 21:48
 * @Version 1.0
 */
@RefreshScope
@RestController
public class TestController {

    private final RestTemplate restTemplate;

    @Autowired
    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/sout/{str}")
    public String sout(@PathVariable String str) {
        return restTemplate.getForObject("http://service-provider/test/" + str, String.class);
    }
}
