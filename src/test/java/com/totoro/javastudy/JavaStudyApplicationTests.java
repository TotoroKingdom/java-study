package com.totoro.javastudy;

import com.totoro.javastudy.service.AppleService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaStudyApplicationTests {

//    @Resource
//    AppleService appleService;

    @Test
    void contextLoads() {
        AppleService appleService = new AppleService();
        appleService.test();
    }

}
