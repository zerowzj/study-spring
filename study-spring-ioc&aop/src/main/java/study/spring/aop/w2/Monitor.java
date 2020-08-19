package study.spring.aop.w2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;

public class Monitor implements Ordered {

    private static final Logger LOGGER = LoggerFactory.getLogger(Monitor.class);

    public void doBefore() {
        LOGGER.info("Before Before");
    }

    public void doAfter() {
        LOGGER.info("After After");
    }

    public void doAfterThrowing() {
        LOGGER.info("AfterThrowing AfterThrowing");
    }

    public void doAfterReturning() {
        LOGGER.info("AfterReturning AfterReturning");
    }

    public Object doAround(ProceedingJoinPoint joinpoint) {
        LOGGER.info("Around Around");
        Object result = null;
        try {
            LOGGER.info("环绕通知开始 日志记录");
            long start = System.currentTimeMillis();

            //有返回参数 则需返回值
            result =  joinpoint.proceed();

            long end = System.currentTimeMillis();
            LOGGER.info("总共执行时长" + (end - start) + " 毫秒");
            LOGGER.info("环绕通知结束 日志记录");
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("出现错误");
        }
        return result;
    }

    @Override
    public int getOrder() {
        return 6;
    }
}
