package study.spring.aop.bean.advice;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

@Slf4j
public class CustomMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.info("sfasdfasdfasdf");
        invocation.getMethod();
        invocation.getArguments();
        Object ret = invocation.proceed();
        return ret;
    }
}
