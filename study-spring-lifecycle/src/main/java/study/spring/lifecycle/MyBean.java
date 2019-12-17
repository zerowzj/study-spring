package study.spring.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyBean.class);

    //@Value("123123123")
    private String name;

    public MyBean() {
        LOGGER.info("======>实例化");
    }

    @PostConstruct
    public void postConstruct() {
        LOGGER.info("======>执行 postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        LOGGER.info("======>执行 preDestroy");
    }

    public void init() {
        LOGGER.info("======>执行 init");
    }

    public void destroy() {
        LOGGER.info("======>执行 destroy");
    }


    public void setName(String name) {
        LOGGER.info("======>依赖注入");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
