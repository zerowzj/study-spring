package study.spring.enable.enable.hello;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloBean {

    public void sayHi(String name) {
        log.info("hello, {}", name);
    }
}
