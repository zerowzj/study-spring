package study.spring.aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class MyAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyAspect.class);

    @Before("execution(* study.spring.aop..*.*(..))")
    public void before() {
        LOGGER.info("12313123123123123123123");
    }

    @After("execution(* study.spring.aop..*.*(..))")
    public void after() {
        LOGGER.info("abasfsadfasdfsafsfas");
    }
}
