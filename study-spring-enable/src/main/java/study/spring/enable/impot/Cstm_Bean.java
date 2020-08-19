package study.spring.enable.impot;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cstm_Bean {

    static {
        log.info(">>>>>> 初始化 ImportBean");
    }

    public Cstm_Bean() {
        log.info(">>>>>> 实例化 ImportBean");
    }

    public void sayHi() {
        log.info("sssssssss");
    }
}
