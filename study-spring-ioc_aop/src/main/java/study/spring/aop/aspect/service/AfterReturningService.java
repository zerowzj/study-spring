package study.spring.aop.aspect.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AfterReturningService {

    public String get() {
        log.info("开始");
        try {

        } finally {
            log.info("返回");
        }
        return "啊啊啊啊啊啊啊啊";
    }

    /**
     * （★）方法异常时，返回后通知不执行
     */
    public String throwEx() {
        log.info("开始");
        if (1 == 1) {
            throw new IllegalStateException("非法");
        }
        return "啊啊啊啊啊啊啊啊";
    }
}
