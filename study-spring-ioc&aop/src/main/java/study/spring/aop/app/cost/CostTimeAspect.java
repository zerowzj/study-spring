package study.spring.aop.app.cost;

import com.google.common.base.Stopwatch;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Slf4j
@Aspect
@Component
public class CostTimeAspect {

    /**
     * ====================
     * 定义切面
     * ====================
     */
    @Pointcut("execution(* study.springboot.base.aop.*Service.*(..))")
    public void costTimePointcut() {
    }

    /**
     * ====================
     * 环绕通知
     * ====================
     */
    @Around("costTimePointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info(">>>>>> cost time");
        Stopwatch stopwatch = Stopwatch.createStarted();
        String name = null;
        try {
            //（★）对象
            Object target = joinPoint.getTarget();
            //log.info(target.getClass().getName());
            //（★）参数
            Object[] args = joinPoint.getArgs();
            //（★）签名
            Signature sign = joinPoint.getSignature();
            name = sign.toShortString();
//            log.info(sign.getName());
//            log.info(sign.getDeclaringType().getName());
//            log.info(sign.getDeclaringTypeName());
//            log.info(sign.toString());
//            log.info(sign.toShortString());
//            log.info(sign.toLongString());
            //（★）
            String kind = joinPoint.getKind();
            //log.info(kind);
            return joinPoint.proceed();
        } catch (Throwable ex) {
            ex.printStackTrace();
            throw ex;
        } finally {
            log.info("{} cost time{} ms", name, stopwatch.elapsed(TimeUnit.MILLISECONDS));
        }
    }
}
