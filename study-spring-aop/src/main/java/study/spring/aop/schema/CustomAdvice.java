package study.spring.aop.schema;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

@Slf4j
public class CustomAdvice {

    /**
     * 前置通知
     */
    public void before(JoinPoint joinPoint) {
        log.info("before");
    }

    /**
     * 后置通知
     */
    public void after(JoinPoint joinPoint) {
        log.info("after");
    }

    /**
     * 环绕通知
     */
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

    /**
     * 返回通知
     */
    public void afterReturning(JoinPoint joinPoint, Object retValue) {
        log.info("afterReturning");
    }

    /**
     * 异常通知
     */
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        log.info("afterThrowing");
    }
}
