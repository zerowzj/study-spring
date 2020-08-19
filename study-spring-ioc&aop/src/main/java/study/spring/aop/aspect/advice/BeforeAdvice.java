package study.spring.aop.aspect.advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import study.springboot.aop.aspect.Label;

/**
 * （★）前置通知
 */
@Slf4j
@Aspect
@Component
public class BeforeAdvice {

    @Before(value = "execution(* study.springboot.aop.aspect.service.BeforeService.*(..))")
    public void before(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        String sname = signature.getName();
        log.info(">>>>>> before, {}", sname);
    }

    @Before(value = "@annotation(label)")
    public void before1(JoinPoint joinPoint, Label label) {
        String name = label.name();
        Signature signature = joinPoint.getSignature();
        String sname = signature.getName();
        log.info(">>>>>> before, {}, label_name={}", sname, name);
    }
}
