package study.spring.lifecycle.aware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyBean.class);

    //@Value("123123123")
    private String name;

    @PostConstruct
    public void postConstruct() {
        LOGGER.info("======>执行 postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        LOGGER.info("======>执行 preDestroy");
    }

    public void initMethod() {
        LOGGER.info("======>执行 initMethod");
    }

    public void destroyMethod() {
        LOGGER.info("======>执行 destroyMethod");
    }

    public MyBean() {
        LOGGER.info("======>实例化");
    }

    public void setName(String name) {
        LOGGER.info("======>依赖注入");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setBeanName(String name) {
        LOGGER.info("======>执行BeanNameAware.setBeanName()");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        LOGGER.info("======>执行BeanFactoryAware.setBeanFactory()");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        LOGGER.info("======>执行ApplicationContextAware.setApplicationContext()");
    }
}
