package com.ruoyi.common.generator;

import com.ruoyi.common.generator.generator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = generatorTest.class)
public class generatorTest {
    @Test
    public void generator(){
        generator.generator();
    }

}
