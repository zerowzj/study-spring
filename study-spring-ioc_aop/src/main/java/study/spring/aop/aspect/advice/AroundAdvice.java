package study.spring.aop.aspect.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class AroundAdvice {

    /**
     * ====================
     * （★）环绕通知
     * ====================
     */
    @Around("logPointcut()")
    public void around() {
        log.info(">>>>>>>>>>  afterThrowing");
    }
}
