package study.spring.aop.aspect.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * ====================
 * （★）后置通知
 * ====================
 */
@Slf4j
@Aspect
@Component
public class AfterAdvice {

    @After(value = "within(study.spring.aop.aspect.service.AfterService)")
    public void after(JoinPoint joinPoint) {
        log.info(">>>>>> after");
    }

    @After(value = "@within(study.spring.aop.aspect.Label)")
    public void after1(JoinPoint joinPoint) {
        log.info(">>>>>> after");
    }
}
