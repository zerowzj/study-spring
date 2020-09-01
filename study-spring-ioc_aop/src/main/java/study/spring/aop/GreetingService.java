package study.spring.aop;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GreetingService {

    public String sayHi(String name) {
        String str = String.format("hello, %s", name);
        log.info(str);
        return str;
    }

    public String sayBye(String name) {
        String str = String.format("bye bye, %s", name);
        log.info(str);
        return str;
    }
}
