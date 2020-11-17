package study.spring.enable.impot;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ImportBean {

    static {
        log.info(">>>>>> initialization");
    }

    public ImportBean() {
        log.info(">>>>>> instantiation");
    }

    public void sayHi() {
        log.info("hi hi hi");
    }
}
