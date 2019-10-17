package com.x.cloud.alibaba.consumer.service;

import com.x.cloud.alibaba.consumer.service.fallback.TestFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: zjx
 * @Date: 2019/10/10 22:05
 * @Version 1.0
 */
@FeignClient(value = "service-provider",fallback = TestFeignServiceFallback.class)
public interface ITestFeignService {

    @GetMapping("/test/{s}")
    String sout(@PathVariable String s);
}
