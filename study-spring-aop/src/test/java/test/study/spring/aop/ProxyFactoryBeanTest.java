package test.study.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import study.spring.aop.GreetingService;
import study.spring.aop.xml.advice.CustomBeforeAdvice;

@Slf4j
public class ProxyFactoryBeanTest {

    @Test
    public void test() {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        //
        BeanDefinitionBuilder b1 = BeanDefinitionBuilder.genericBeanDefinition(CustomBeforeAdvice.class);
        BeanDefinition bd1 = b1.getBeanDefinition();
        factory.registerBeanDefinition("customBeforeAdvice", bd1);
        //
        BeanDefinitionBuilder b2 = BeanDefinitionBuilder.genericBeanDefinition(ProxyFactoryBean.class);
        b2.addPropertyValue("target", new GreetingService());
        b2.addPropertyValue("interceptorNames", "customBeforeAdvice");
        BeanDefinition bd2 = b2.getBeanDefinition();
        factory.registerBeanDefinition("greetingService", bd2);

        GreetingService greetingService = (GreetingService) factory.getBean("greetingService");
        log.info(">>>>>> {}", greetingService.getClass().getSimpleName());
        greetingService.sayHi("11111111111");
    }
}
