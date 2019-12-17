package test.study.spring.annotation;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.sping.annotation.enable.SpringEnableCfg;
import study.sping.annotation.enable.hello.HelloBean;
import study.sping.annotation.enable.server.Server;

public class EnableTest {

    private AnnotationConfigApplicationContext context;

    @Before
    public void init() {
        context = new AnnotationConfigApplicationContext();
        context.register(SpringEnableCfg.class);
        context.refresh();
    }

    @Test
    public void helloTest() {
        HelloBean helloBean = context.getBean(HelloBean.class);
        helloBean.sayHi();
    }

    @Test
    public void serverTest() {
        Server server = context.getBean(Server.class);
        server.start();
        server.stop();
    }
}
