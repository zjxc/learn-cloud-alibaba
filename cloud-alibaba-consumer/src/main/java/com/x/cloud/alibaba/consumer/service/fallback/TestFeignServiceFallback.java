package com.x.cloud.alibaba.consumer.service.fallback;

import com.x.cloud.alibaba.consumer.service.ITestFeignService;
import org.springframework.stereotype.Component;

/**
 * @Auther: zjx
 * @Date: 2019/10/17 21:35
 * @Version 1.0
 */
@Component
public class TestFeignServiceFallback implements ITestFeignService {

    @Override
    public String sout(String s) {
        return "请检查网络！";
    }
}
