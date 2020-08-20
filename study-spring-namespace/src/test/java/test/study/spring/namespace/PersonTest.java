package test.study.spring.namespace;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.namespace.Person;

@Slf4j
public class PersonTest {

    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        Person p = (Person) ctx.getBean("cutesource");
        log.info("{}", p);
    }
}
