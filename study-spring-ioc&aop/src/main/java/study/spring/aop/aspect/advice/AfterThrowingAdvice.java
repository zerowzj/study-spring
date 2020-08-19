package study.spring.aop.aspect.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * ====================
 * （★）异常通知
 * ====================
 */
@Slf4j
@Aspect
@Component
public class AfterThrowingAdvice {

    @AfterThrowing(value = "target(study.springboot.aop.aspect.service.AfterThrowingService)",
            throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Throwable ex) {
        log.info(">>>>>>>>>>  after throwing");
    }
}
