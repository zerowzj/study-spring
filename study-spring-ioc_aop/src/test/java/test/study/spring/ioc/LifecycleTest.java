package test.study.spring.ioc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.ioc.bean.MyAnnotBean;
import study.spring.ioc.bean.MyConfigBean;
import study.spring.ioc.bean.MyLifecycleBean;

import java.util.concurrent.TimeUnit;

@Slf4j
public class LifecycleTest {

    @Test
    public void test() throws Exception {
        String configLocation = "spring/spring-lifecycle.xml";
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(configLocation);
        //不显示close不执行destroy-method方法
        ctx.close();
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.registerBean(MyLifecycleBean.class);
        //需要手动刷新
        ctx.refresh();
        MyLifecycleBean myBean = (MyLifecycleBean) ctx.getBean("myLifecycleBean");
        log.info("{}", myBean);
        ctx.close();
    }
}
