package test.study.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.ioc.bean.MyConfigBean;

@Slf4j
public class AopConfigTest {

    private static final String CONFIG_LOCATION = "spring/spring-config.xml";

    @Test
    public void test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        log.info("容器启动完成");
        //
        MyConfigBean myBean = (MyConfigBean) ctx.getBean("myConfigBeanProxy");
        log.info("{}", myBean);
    }
}
