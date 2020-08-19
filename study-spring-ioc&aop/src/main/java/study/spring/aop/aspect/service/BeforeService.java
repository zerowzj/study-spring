package study.spring.aop.aspect.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import study.spring.aop.aspect.Label;

@Slf4j
@Component
public class BeforeService {

    /**
     *
     */
    public void sayHi() {
        log.info("hi");
    }

    /**
     *
     */
    @Label(name = "haha")
    public void sayHello(String name) {
        log.info("hello, {}", name);
    }
}
