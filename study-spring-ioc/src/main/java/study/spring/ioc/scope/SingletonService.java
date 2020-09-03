package study.spring.ioc.scope;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SingletonService {

    public SingletonService() {
        log.info(">>>>>>>>>> new");
    }

    public void demo() {
    }
}
