package com.sss;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author sss
 * @date 2018/12/28
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test1() {
        String name = "JavaEdge";
        String password = "123456";

        log.info("name: " + name + " ,password: " + password);


        log.info("name: {}, password: {}", name, password);

        log.error("error...");
    }
}
