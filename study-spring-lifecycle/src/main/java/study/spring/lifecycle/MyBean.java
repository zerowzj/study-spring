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
        LOGGER.info("====================");
        LOGGER.info("实例化");
        LOGGER.info("====================");
    }

    @PostConstruct
    public void postConstruct() {
        LOGGER.info("====================");
        LOGGER.info("执行 postConstruct");
        LOGGER.info("====================");
    }

    @PreDestroy
    public void preDestroy() {
        LOGGER.info("====================");
        LOGGER.info("执行 preDestroy");
        LOGGER.info("====================");
    }

    public void init() {
        LOGGER.info("====================");
        LOGGER.info("执行 init");
        LOGGER.info("====================");
    }

    public void destroy() {
        LOGGER.info("====================");
        LOGGER.info("执行 destroy");
        LOGGER.info("====================");
    }

    public void setName(String name) {
        LOGGER.info("====================");
        LOGGER.info("依赖注入");
        LOGGER.info("====================");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
