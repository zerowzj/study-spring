package study.spring.aop.app.log;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LogAspect {

    /**
     * 定义切面
     */
    @Pointcut("execution(* study.springboot.base.aop.*Service.*(..))")
    public void logPointcut() {
    }

    /**
     * 在同一个 aspect 类中，针对同一个 pointcut，定义了两个相同的 advice(比如，定义了两个 @Before)，
     * 那么这两个 advice 的执行顺序是无法确定的，哪怕你给这两个 advice 添加了 @Order 这个注解，也不行。
     * 这点切记
     */
    @Before("logPointcut()")
    public void before(JoinPoint joinPoint) {
        log.info(">>>>>>>>>> before");
    }

    @After("logPointcut()")
    public void after(JoinPoint joinPoint) {
        log.info(">>>>>>>>>> after");
    }

    @AfterReturning(value = "logPointcut()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        log.info(">>>>>>>>>> afterReturning");
    }

    @AfterThrowing("logPointcut()")
    public void afterThrowing() {
        log.info(">>>>>>>>>>  afterThrowing");
    }
}
