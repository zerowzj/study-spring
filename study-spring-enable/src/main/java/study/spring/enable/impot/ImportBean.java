package study.spring.enable.impot;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ImportBean {

    static {
        log.info(">>>>>> 初始化 ImportBean");
    }

    public ImportBean() {
        log.info(">>>>>> 实例化 ImportBean");
    }

    public void sayHi() {
        log.info("sssssssss");
    }
}
