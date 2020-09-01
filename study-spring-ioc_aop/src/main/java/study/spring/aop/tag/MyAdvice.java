package study.spring.aop.tag;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

@Slf4j
public class MyAdvice {

    public void before(JoinPoint joinPoint) {
        log.info("before");
    }

    public void after(JoinPoint joinPoint) {
        log.info("after");
    }

    public Object around(ProceedingJoinPoint joinPoint) {
        log.info("around");
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public void afterReturning(JoinPoint joinPoint, Object retValue) {
        log.info("afterReturning");
    }

    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        log.info("afterThrowing");
    }
}
