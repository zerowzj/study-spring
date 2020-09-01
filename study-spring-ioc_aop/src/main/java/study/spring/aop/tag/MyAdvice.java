package study.spring.aop.tag;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.Joinpoint;

@Slf4j
public class MyAdvice {

    public void before(Joinpoint aaa) {
        log.info("before");
    }

    public void after(Joinpoint joinPoint) {
        log.info("after");
    }

    public Object around(Joinpoint joinPoint) {
        log.info("around");
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public void afterReturning(Joinpoint joinPoint, Object returnValue) {
        log.info("afterReturning");
    }

    public void afterThrowing(Joinpoint joinPoint, Exception ex) {
        log.info("afterThrowing");
    }
}
