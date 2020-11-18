package test.study.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.aop.GreetingService;

@Slf4j
public class AnnotationTest {

    private static final String CONFIG_LOCATION = "spring/spring-annotation.xml";

    @Test
    public void xml_test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        //
        GreetingService greetingService = (GreetingService) ctx.getBean("greetingService");
        greetingService.sayHi("wangzhj");
    }

    @Test
    public void annotation_test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        //
        GreetingService greetingService = (GreetingService) ctx.getBean("greetingService");
        greetingService.sayHi("wangzhj");
    }
}
