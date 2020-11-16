package study.spring.enable.conditional.person;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Slf4j
@Conditional(PersonCondition.class)
@Component
public class Person {

    private String name;

    public Person(){
        this.name = "wangzhj";
        log.info(">>>>>>>>>> init person");
    }
}
