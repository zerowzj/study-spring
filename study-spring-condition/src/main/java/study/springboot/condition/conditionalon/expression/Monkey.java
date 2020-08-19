package study.springboot.condition.conditionalon.expression;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Monkey implements Animal {

    @Override
    public void show() {
        log.info("i am a Monkey");
    }
}
