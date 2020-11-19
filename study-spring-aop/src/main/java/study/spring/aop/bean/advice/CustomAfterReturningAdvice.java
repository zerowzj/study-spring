package study.spring.aop.bean.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

@Slf4j
public class CustomAfterReturningAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method,
                               Object[] args, Object target) throws Throwable {
        log.info("return_value= {}", returnValue);
    }
}
