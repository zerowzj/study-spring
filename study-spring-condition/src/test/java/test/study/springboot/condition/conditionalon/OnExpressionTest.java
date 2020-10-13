package test.study.springboot.condition.conditionalon;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import study.springboot.condition.conditional_on.expression.Animal;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SpringBootCfg.class)
public class OnExpressionTest {

    @Autowired
    private List<Animal> animalLt;

    @Test
    public void test() {
        animalLt.forEach(animal -> {
            animal.show();
        });
    }
}
