package test.study.springboot.condition.conditional;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import study.springboot.condition.conditional.car.Car;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CarTest.class)

@SpringBootApplication(scanBasePackages = "study.springboot.condition.conditional")
public class CarTest {

    @Autowired
    private Car car;

    @Test
    public void test() {
        car.engine();
    }
}
