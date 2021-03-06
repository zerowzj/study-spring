package study.spring.ioc.bean_factory.bean;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Getter
@ToString
public class XmlBean implements InitializingBean, DisposableBean {

    private String name;

    //初始化和实例化
    static {
        log.info("====== 初始化");
    }

    public XmlBean() {
        log.info("====== 实例化");
    }

    //setter依赖注入
    public void setName(String name) {
        log.info("====== set name value");
        this.name = name;
    }

    //注解
    @PostConstruct
    public void init() {
        log.info("====== @PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("====== @PreDestroy");
    }

    //InitializingBean和DisposableBean
    @Override
    public void destroy() throws Exception {
        log.info("====== destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("====== afterPropertiesSet");
    }

    //nit-method和destroy-method
    public void myInit(){
        log.info("====== myInit");
    }

    public void myDestroy(){
        log.info("====== myDestroy");
    }

}
