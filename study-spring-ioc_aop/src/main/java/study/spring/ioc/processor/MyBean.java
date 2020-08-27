package study.spring.ioc.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class MyBean implements InitializingBean, DisposableBean {

    private MyCar myCar;

    static {
        log.info(">>>>>> 初始化 MyBean");
    }

    public MyBean() {
        log.info(">>>>>> 实例化 MyBean");
    }

    @PostConstruct
    public void init() {
        log.info(">>>>>> @PostConstruct 初始化");
    }

    @PreDestroy
    public void clean() {
        log.info(">>>>>> @PreDestroy 清理");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info(">>>>>> afterPropertiesSet 初始化");
    }
    @Override
    public void destroy() throws Exception {
        log.info(">>>>>> destroy 清理");
    }

    @Autowired
    public void setMyCar(MyCar myCar) {
        log.info(">>>>>> 设置 MyCar");
        this.myCar = myCar;
    }

}
