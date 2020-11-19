package test.study.spring.ioc.bean_factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.spring.ioc.bean_factory.annotation.AnnotationBean;

@Slf4j
//@ComponentScan("study.spring.ioc.bean_factory.annotation")
public class AnnotationTest {

    String CONFIG_LOCATION = "spring/spring-annotation.bean";

    @Test
    public void xml_test() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        AnnotationBean annotBean = ctx.getBean(AnnotationBean.class);
        log.info("{}", annotBean);
        ctx.close();
    }

    @Test
    public void annotation_test() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        //（1）结合注解@ComponentScan使用
        //ctx.register(AnnotationTest.class);
        //（2）扫描包
        ctx.scan("study.spring.ioc.bean_factory.annotation");

        //需要手动刷新
        ctx.refresh();

        AnnotationBean annotBean = ctx.getBean(AnnotationBean.class);
        log.info("{}", annotBean);
        ctx.close();
    }
}
