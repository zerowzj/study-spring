package study.spring.aop.annotation;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class CustomAspect {

    /**
     * 切入点
     */
    @Pointcut("execution(* study.spring.aop.*Service.*(..))")
    public void myPointcut() {
    }

    /**
     * 前置通知
     * 在同一个 aspect 类中，针对同一个 pointcut，定义了两个相同的 advice(比如，定义了两个 @Before)，
     * 那么这两个 advice 的执行顺序是无法确定的，哪怕你给这两个 advice 添加了 @Order 这个注解，也不行。
     * 这点切记
     */
    @Before("myPointcut()")
    public void before(JoinPoint joinPoint) {
        log.info(">>>>>>>>>> before");
    }

    /**
     * 后置通知
     */
    @After("myPointcut()")
    public void after(JoinPoint joinPoint) {
        log.info(">>>>>>>>>> after");
    }

    /**
     * 环绕通知
     */
    @Around("myPointcut()")
    public void around(JoinPoint joinPoint) {
        log.info(">>>>>>>>>> after");
    }

    /**
     * 返回通知
     */
    @AfterReturning(value = "myPointcut()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        log.info(">>>>>>>>>> afterReturning");
    }

    /**
     * 异常通知
     */
    @AfterThrowing("myPointcut()")
    public void afterThrowing() {
        log.info(">>>>>>>>>>  afterThrowing");
    }
}
