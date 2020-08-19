package study.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AopServiceImpl implements AopService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AopServiceImpl.class);

    @Override
    public String sayHi(String name) {
        LOGGER.info("greet, {}", name);
        return "greet, " + name;
    }
}
