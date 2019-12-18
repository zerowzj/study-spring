package study.sping.annotation.condition.person;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Man implements Person {

    @Override
    public void sayHi() {
        log.info("i am man");
    }
}
