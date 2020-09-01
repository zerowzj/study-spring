package study.spring.aop.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Slf4j
@Aspect
public class MyAspect {

    /**
     * 定义切面
     */
    @Pointcut("execution(* study.spring.aop.*Service.*(..))")
    public void myPointcut() {
    }

    /**
     * 在同一个 aspect 类中，针对同一个 pointcut，定义了两个相同的 advice(比如，定义了两个 @Before)，
     * 那么这两个 advice 的执行顺序是无法确定的，哪怕你给这两个 advice 添加了 @Order 这个注解，也不行。
     * 这点切记
     */
    @Before("myPointcut()")
    public void before(JoinPoint joinPoint) {
        log.info(">>>>>>>>>> before");
    }

    @After("myPointcut()")
    public void after(JoinPoint joinPoint) {
        log.info(">>>>>>>>>> after");
    }

    @AfterReturning(value = "myPointcut()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        log.info(">>>>>>>>>> afterReturning");
    }

    @AfterThrowing("myPointcut()")
    public void afterThrowing() {
        log.info(">>>>>>>>>>  afterThrowing");
    }
}
