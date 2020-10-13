package study.springboot.condition.conditional_on.property;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Audi implements Car {

    @Override
    public void logo() {
        log.info("Audi Audi Audi");
    }
}
