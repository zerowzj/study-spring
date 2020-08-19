package study.spring.ioc.scope;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
//@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PrototypeService {

    public PrototypeService() {
        log.info(">>>>>>>>>> new");
    }

    @PostConstruct
    public void init(){
        log.info("init");
    }

    public void demo() {

    }
}
