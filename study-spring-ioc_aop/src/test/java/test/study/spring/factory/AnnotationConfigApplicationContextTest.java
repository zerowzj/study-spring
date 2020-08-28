package test.study.spring.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.spring.ioc.bean.MyAnnotBean;
import study.spring.ioc.bean.MyConfigBean;
import study.spring.ioc.bean.MyLifecycleBean;

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
        ctx.registerBean(MyLifecycleBean.class);

        //需要手动刷新
        ctx.refresh();
        log.info("容器启动完成");

        TimeUnit.SECONDS.sleep(5);
        MyAnnotBean myBean = (MyAnnotBean) ctx.getBean("myAnnotBean");
        log.info("{}", myBean);

        ctx.close();
    }
}
