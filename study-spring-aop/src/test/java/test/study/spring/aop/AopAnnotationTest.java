package test.study.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.aop.GreetingService;

@Slf4j
public class AopAnnotationTest {

    private static final String CONFIG_LOCATION = "spring/spring-aop-annotation.bean";

    @Test
    public void xml_test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        //
        GreetingService greetingService = (GreetingService) ctx.getBean("greetingService");
        greetingService.sayHi("wangzhj");
    }

    @Test
    public void annotation_test() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("study.spring.aop");
        ctx.refresh();
        //
        GreetingService greetingService = (GreetingService) ctx.getBean("greetingService");
        greetingService.sayHi("wangzhj");
    }
}
