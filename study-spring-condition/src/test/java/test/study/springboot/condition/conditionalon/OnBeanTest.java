package test.study.springboot.condition.conditionalon;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import study.springboot.condition.conditional_on.bean.People;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OnBeanTest.class)

@SpringBootApplication(scanBasePackages = "study.springboot.condition.conditional_on.bean")
public class OnBeanTest {

    @Autowired(required = false)
    private People people;

    @Test
    public void test() {
        log.info("{}", people);
    }
}
