package study.spring.ioc.bean;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Getter
@ToString

@Component
public class MyAnnotBean {

    private String name;

    static {
        log.info(">>>>>> 初始化");
    }

    public MyAnnotBean() {
        log.info(">>>>>> 实例化");
    }

    @PostConstruct
    public void init() {
        log.info(">>>>>> @PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        log.info(">>>>>> @PreDestroy");
    }

    public void setName(String name) {
        log.info(">>>>>> set name value");
        this.name = name;
    }
}
