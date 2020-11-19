package study.spring.aop.bean.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

@Slf4j
public class CustomBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        log.info("target= {}", target.getClass().getName());
        log.info("method= {}", method.getName());
        Arrays.stream(args).forEach(e -> {
            log.info("args= {}", e);
        });
        log.info("ffffffffffffffffff");
    }
}
