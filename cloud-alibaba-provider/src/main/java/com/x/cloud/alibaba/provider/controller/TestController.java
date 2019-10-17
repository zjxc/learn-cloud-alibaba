package com.x.cloud.alibaba.provider.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zjx
 * @Date: 2019/10/10 20:39
 * @Version 1.0
 */
@RefreshScope
@RestController
public class TestController {


    @GetMapping("/test/{str}")
    public String test(@PathVariable String str) {
        return str;
    }



}
