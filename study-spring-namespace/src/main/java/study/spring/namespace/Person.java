package study.spring.namespace;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;

@Slf4j
@Setter
@Getter
@ToString
public class Person implements InitializingBean {

    private String id;

    private String name;

    private int age;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("safdfasdfasdf");
    }
}
