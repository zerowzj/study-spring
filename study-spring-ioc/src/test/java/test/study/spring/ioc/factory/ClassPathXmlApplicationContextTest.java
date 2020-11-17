package test.study.spring.ioc.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.ioc.bean.ConfigBean;

import java.util.concurrent.TimeUnit;

@Slf4j
public class ClassPathXmlApplicationContextTest {

    private static final String CONFIG_LOCATION = "spring/spring-configuration.xml";

    @Test
    public void test() throws Exception {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        log.info("容器启动完成");
        //
        TimeUnit.SECONDS.sleep(5);
        ConfigBean configBean = (ConfigBean) ctx.getBean("configBean");
        log.info("{}", configBean);

        //不显示close不执行destroy-method方法
        ctx.close();
    }
}
