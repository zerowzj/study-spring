package test.study.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.aop.GreetingService;

@Slf4j
public class AopXmlTest {

    String CONFIG_LOCATION = "spring/spring-xml.xml";

    @Test
    public void test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        //
        GreetingService greetingService = (GreetingService) ctx.getBean("greetingService");
        log.info(">>>>>> {}", greetingService.getClass().getSimpleName());
        greetingService.sayHi("wangzhj");
    }
}
