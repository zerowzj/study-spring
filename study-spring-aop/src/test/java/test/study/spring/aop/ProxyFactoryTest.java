package test.study.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import study.spring.aop.GreetingService;
import study.spring.aop.xml.advice.CustomAfterReturningAdvice;
import study.spring.aop.xml.advice.CustomBeforeAdvice;

@Slf4j
public class ProxyFactoryTest {

    @Test
    public void test() {
        NameMatchMethodPointcutAdvisor advisor1 = new NameMatchMethodPointcutAdvisor();
        advisor1.setMappedName("sayHi");
        advisor1.setAdvice(new CustomBeforeAdvice());
        NameMatchMethodPointcutAdvisor advisor2 = new NameMatchMethodPointcutAdvisor();
        advisor2.setMappedName("sayHi");
        advisor2.setAdvice(new CustomAfterReturningAdvice());

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingService());
        proxyFactory.addAdvisor(advisor1);
        proxyFactory.addAdvisor(advisor2);

        GreetingService greetingService = (GreetingService) proxyFactory.getProxy();
        log.info(">>>>>> {}", greetingService.getClass());
        greetingService.sayHi("wangzhj");
    }
}
