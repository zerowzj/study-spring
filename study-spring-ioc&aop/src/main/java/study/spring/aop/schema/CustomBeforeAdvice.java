package study.spring.aop.schema;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class CustomBeforeAdvice implements MethodBeforeAdvice {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomBeforeAdvice.class);

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        LOGGER.info("MethodBeforeAdvice...");
    }
}
