package study.springboot.condition.conditional_on.expression;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Lion implements Animal {

    @Override
    public void show() {
        log.info("i am a Lion");
    }
}
