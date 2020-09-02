package study.spring.ioc.bean;

import com.sun.org.apache.xml.internal.security.Init;
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
public class AnnotBean implements InitializingBean, DisposableBean {

    private String name;

    //********** 初始化和实例化 **********
    static {
        log.info("====== 初始化");
    }

    public AnnotBean() {
        log.info("====== 实例化");
    }

    //********** setter依赖注入 **********
    public void setName(String name) {
        log.info("====== set name value");
        this.name = name;
    }

    //********** 注解 **********
    @PostConstruct
    public void init() {
        log.info("====== @PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("====== @PreDestroy");
    }

    //********** InitializingBean和DisposableBean **********
    @Override
    public void destroy() throws Exception {
        log.info("====== destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("====== afterPropertiesSet()");
    }

    //********** init-method和destroy-method **********
    public void myInit() {
        log.info("====== myInit()");
    }

    public void myDestroy() {
        log.info("====== myDestroy()");
    }
}