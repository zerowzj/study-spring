package test.study.spring.ioc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.ioc.bean.MyBean;

@Slf4j
public class TTT {

    @Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-ioc/spring-ioc-config.xml");
        MyBean myBean = (MyBean)ctx.getBean("myBean");
        log.info("{}", myBean);
    }
}
