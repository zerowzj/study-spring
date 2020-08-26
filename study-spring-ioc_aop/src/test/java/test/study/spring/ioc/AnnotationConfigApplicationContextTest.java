package test.study.spring.ioc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@ComponentScan("")
public class AnnotationConfigApplicationContextTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AnnotationConfigApplicationContextTest.class);

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
    }
}
