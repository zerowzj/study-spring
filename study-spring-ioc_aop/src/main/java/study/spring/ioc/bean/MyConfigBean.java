package study.spring.ioc.bean;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Getter
@ToString
public class MyConfigBean {

    private String name;

    static {
        log.info(">>>>>> 初始化");
    }

    public MyConfigBean() {
        log.info(">>>>>> 实例化");
    }

    public void setName(String name) {
        log.info(">>>>>> set name value");
        this.name = name;
    }

    public void init() {
        log.info(">>>>>> init");
    }

    public void destroy() {
        log.info(">>>>>> destroy");
    }
}
