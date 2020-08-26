package study.spring.ioc.bean;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@ToString
public class MyBean {

    private String name;

    private int age;

    static {
        log.info(">>>>>> 初始化");
    }

    public MyBean() {
        log.info(">>>>>> 实例化");
    }

    public void setName(String name) {
        log.info(">>>>>> set name value");
        this.name = name;
    }

    public void setAge(int age) {
        log.info(">>>>>> set age value");
        this.age = age;
    }
}
