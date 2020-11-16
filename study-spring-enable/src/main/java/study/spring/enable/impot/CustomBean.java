package study.spring.enable.impot;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomBean {

    static {
        log.info(">>>>>> 初始化 ImportBean");
    }

    public CustomBean() {
        log.info(">>>>>> 实例化 ImportBean");
    }

    public void sayHi() {
        log.info("sssssssss");
    }
}
