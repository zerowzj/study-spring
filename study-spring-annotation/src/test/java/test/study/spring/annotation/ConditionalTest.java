package test.study.spring.annotation;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.sping.annotation.conditional.person.Person;
import study.sping.annotation.conditional.person.PersonCfg;

import java.util.Map;

public class ConditionalTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConditionalTest.class);

    private AnnotationConfigApplicationContext context;

    @Before
    public void init() {
        context = new AnnotationConfigApplicationContext(PersonCfg.class);
    }

    @Test
    public void test(){
        Map<String, Person> persons = context.getBeansOfType(Person.class);
        for(Person person :persons.values()){
            person.sayHi();
        }
    }
}
