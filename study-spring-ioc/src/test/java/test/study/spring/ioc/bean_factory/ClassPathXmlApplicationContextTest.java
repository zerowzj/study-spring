package test.study.spring.ioc.bean_factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class ClassPathXmlApplicationContextTest {

    String CONFIG_LOCATION = "spring/spring-bean.bean";

    @Test
    public void test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        log.info(">>>>>> ");
        ctx.getBean("xmlBean");
    }
}
