package test.study.springboot.condition.conditional;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import study.springboot.condition.conditional.person.Person;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersonTest.class)

@SpringBootApplication(scanBasePackages = "study.springboot.condition.conditional.person")
public class PersonTest {

    @Autowired
    private Person person;

    @Test
    public void test() {
        log.info("name={}", person.getName());
    }
}
