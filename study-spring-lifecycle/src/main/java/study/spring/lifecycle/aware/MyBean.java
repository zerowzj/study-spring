package study.spring.lifecycle.aware;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class MyBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    //@Value("123123123")
    private String name;

    @PostConstruct
    public void postConstruct() {
        log.info("======>执行 postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("======>执行 preDestroy");
    }

    public void initMethod() {
        log.info("======>执行 initMethod");
    }

    public void destroyMethod() {
        log.info("======>执行 destroyMethod");
    }

    public MyBean() {
        log.info("======>实例化");
    }

    public void setName(String name) {
        log.info("======>依赖注入");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setBeanName(String name) {
        log.info("======>执行BeanNameAware.setBeanName()");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info("======>执行BeanFactoryAware.setBeanFactory()");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("======>执行ApplicationContextAware.setApplicationContext()");
    }
}
