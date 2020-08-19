package study.spring.aop.aspect.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import study.spring.aop.aspect.Label;

@Slf4j
@Component
public class AfterService {

    /**
     *
     */
    public void sayBye() {
        log.info("bye");
    }

    /**
     *
     */
    @Label(name = "haha")
    public void sayGoodBye(String name) {
        log.info("good bye, {}", name);
    }

    /**
     * （★）方法异常时，后置通知仍会执行
     */
    public void throwEx(String name) {
        if (1 == 1) {
            throw new IllegalStateException("throw ex");
        }
        log.info("good bye, {}", name);
    }
}
