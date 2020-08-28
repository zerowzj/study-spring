package study.spring.ioc.bean;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j

@Getter
@ToString
@Component
public class MyLifecycleBean implements InitializingBean, DisposableBean {

    private String name;

    //
    static {
        log.info(">>>>>> 初始化");
    }

    public MyLifecycleBean() {
        log.info(">>>>>> 实例化");
    }

    public void setName(String name) {
        log.info(">>>>>> set name value");
        this.name = name;
    }

    //
    @PostConstruct
    public void init() {
        log.info(">>>>>> @PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        log.info(">>>>>> @PreDestroy");
    }

    //
    @Override
    public void destroy() throws Exception {
        log.info(">>>>>> destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info(">>>>>> afterPropertiesSet()");
    }

    //
    public void myInit(){
        log.info(">>>>>> myInit()");
    }

    //
    public void myDestroy(){
        log.info(">>>>>> myDestroy()");
    }

}
