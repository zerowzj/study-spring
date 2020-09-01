package study.spring.aop.app.auth;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AuthAspect {

    /**
     * ====================
     * 定义切面
     * ====================
     */
    @Pointcut("@annotation(auth)")
    public void authPointcut(Auth auth) {
    }

    /**
     * ====================
     * 前置通知
     * ====================
     */
    @Before("authPointcut(auth))")
    public void before(JoinPoint joinPoint, Auth auth) {
        log.info(">>>>>> before");
        String name = auth.name();
        if (name.equals("abc")) {
            throw new RuntimeException("aaaaaaaa");
        }
    }

    @Around("authPointcut(auth)")
    public Object around(ProceedingJoinPoint joinPoint, Auth auth) throws Throwable {
        log.info(">>>>>> around");
        try {
            Signature sign = joinPoint.getSignature();
            Object target = joinPoint.getTarget();

            log.info(sign.getDeclaringTypeName());
            log.info(sign.toShortString());
            log.info(sign.toLongString());

            String kind = joinPoint.getKind();
            return joinPoint.proceed();
        } catch (Throwable ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            log.info(">>>>>> around {} ms");
        }
    }


}
