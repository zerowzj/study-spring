package test.study.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import study.spring.aop.GreetingService;
import study.spring.aop.advice.MyBeforeAdvice;

@Slf4j
public class ProxyFactoryTest {

    @Test
    public void test(){
        NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor();
        advisor.setMappedName("sayHi");
        advisor.setAdvice(new MyBeforeAdvice());

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingService());
        proxyFactory.addAdvisor(advisor);
        GreetingService greetingService = (GreetingService)proxyFactory.getProxy();
        greetingService.sayHi("fsadfs");
    }
}
