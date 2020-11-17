package test.study.spring.ioc.factory_bean;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.ioc.bean.LifecycleBean;

@Slf4j
public class FactoryBeanTest {

    @Test
    public void config_test() {
        String configLocation = "spring/spring-lifecycle.xml";
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(configLocation);
        //不显示close不执行destroy-method方法
        ctx.close();
    }

    @Test
    public void annot_test() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.registerBean(LifecycleBean.class);
        //需要手动刷新
        ctx.refresh();
        LifecycleBean myBean = (LifecycleBean) ctx.getBean("myLifecycleBean");
        log.info("{}", myBean);
        ctx.close();
    }
}
