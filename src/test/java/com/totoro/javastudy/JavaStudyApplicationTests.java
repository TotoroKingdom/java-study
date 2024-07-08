package com.totoro.javastudy;

import com.totoro.javastudy.service.AppleService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class JavaStudyApplicationTests {



    @Test
    void contextLoads() {
        Map<Object, Object> map = new HashMap<>();

        Apple apple = new Apple(1, map);
        map.put("aa","aa");
        System.out.println(apple);
    }

}
