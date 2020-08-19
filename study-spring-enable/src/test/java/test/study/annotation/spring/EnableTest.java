package test.study.annotation.spring;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.spring.enable.enable.hello.HelloBean;
import study.spring.enable.enable.hello.HelloCfg;

public class EnableTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(HelloCfg.class);
        context.refresh();

        HelloBean bean = context.getBean(HelloBean.class);
        bean.sayHi("wangzhj");
    }
}
