package test.study.spring.ioc.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.spring.ioc.bean.AnnotBean;
import study.spring.ioc.bean.LifecycleBean;

import java.util.concurrent.TimeUnit;

@Slf4j
//@ComponentScan("study.spring.ioc.bean")
public class AnnotationConfigApplicationContextTest {

    @Test
    public void test() throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        //结合注解@ComponentScan使用
//        ctx.register(AnnotationConfigApplicationContextTest.class);
        //
//        ctx.scan("study.spring.ioc.bean");
        //
        ctx.registerBean(LifecycleBean.class);

        //需要手动刷新
        ctx.refresh();
        log.info("容器启动完成");

        TimeUnit.SECONDS.sleep(5);
        AnnotBean annotBean = (AnnotBean) ctx.getBean("myAnnotBean");
        log.info("{}", annotBean);

        ctx.close();
    }
}
