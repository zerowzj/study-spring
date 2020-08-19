package study.spring.aop.aspect.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * ====================
 * （★）结果返回通知
 * ====================
 */
@Slf4j
@Aspect
@Component
public class AfterReturningAdvice {

    @AfterReturning(value = "target(study.spring.aop.aspect.service.AfterReturningService)",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        log.info(">>>>>> after returning");
        log.info("result={}", result);
    }

//    @AfterReturning(value = "@target(study.spring.aop.aspect.Label)",
//            returning = "result")
//    public void afterReturning1(JoinPoint joinPoint, Object result) {
//        log.info(">>>>>> afterReturning");
//        log.info("result={}", result);
//    }
}
