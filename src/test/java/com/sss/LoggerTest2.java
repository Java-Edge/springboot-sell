package com.sss;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author sss
 * @date 2019/1/25
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerTest2 {

    private final Logger logger = LoggerFactory.getLogger(LoggerTest2.class);

    @Test
    public void test1() {
        logger.debug("debug...");
        logger.info("info...");
        logger.error("error...");
    }
}
