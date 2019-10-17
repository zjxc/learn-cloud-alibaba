package com.x.cloud.alibaba.consumer.controller;

import com.x.cloud.alibaba.consumer.service.ITestFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zjx
 * @Date: 2019/10/10 22:05
 * @Version 1.0
 */
@RefreshScope
@RestController
public class TestFeignController {

    @Autowired
    private ITestFeignService testFeignService;

    @GetMapping("/sout/feign/{str}")
    public String sout(@PathVariable String str) {
        return testFeignService.sout(str);
    }

}
