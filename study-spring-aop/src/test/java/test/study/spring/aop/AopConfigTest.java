package test.study.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.aop.GreetingService;

@Slf4j
public class AopConfigTest {

    private static final String CONFIG_LOCATION = "spring/spring-configuration.xml";

    @Test
    public void test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        //
        GreetingService greetingService = (GreetingService) ctx.getBean("greetingService");
        greetingService.sayHi("wangzhj");
    }

    @Test
    public void test1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        //
        GreetingService greetingService = (GreetingService) ctx.getBean("greetingServiceTarget");
        greetingService.sayHi("wangzhj");
    }
}
