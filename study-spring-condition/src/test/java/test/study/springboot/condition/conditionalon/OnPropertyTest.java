package test.study.springboot.condition.conditionalon;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import study.springboot.condition.conditional.car.Car;

@Slf4j
@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SpringBootCfg.class)
public class OnPropertyTest {

    @Autowired
    private Car car;

    @Test
    public void test() {
//        car.logo();
    }
}
