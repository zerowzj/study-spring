package study.spring.aop.w2;

import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;

public class Logger implements Ordered {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Monitor.class);

    public void doBefore() {
        LOGGER.info("Before Before");
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
