package study.springboot.condition.conditional.car;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Benz implements Car {

    @Override
    public void engine() {
        log.info("benz benz benz");
    }
}
