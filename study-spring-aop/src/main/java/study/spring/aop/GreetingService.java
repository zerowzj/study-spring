package study.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GreetingService {

    public String sayHi(String name) {
        String str = String.format("hello, %s", name);
        log.info(str);
        return str;
    }

    public String sayBye(String name) {
        String str = String.format("byebye, %s", name);
        log.info(str);
        return str;
    }
}
