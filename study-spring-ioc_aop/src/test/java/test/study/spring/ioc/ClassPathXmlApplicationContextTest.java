package test.study.spring.ioc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.ioc.bean.MyBean;

import java.util.concurrent.TimeUnit;

@Slf4j
public class ClassPathXmlApplicationContextTest {

    String CONFIG_LOCATION = "spring/spring-config.xml";

    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
    }

    @Test
    public void getBean_test() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        //
        TimeUnit.SECONDS.sleep(10);

        MyBean myBean = (MyBean) ctx.getBean("myBean");
        log.info("{}", myBean);
    }
}
