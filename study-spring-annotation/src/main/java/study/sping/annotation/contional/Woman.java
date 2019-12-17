package study.sping.annotation.contional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Woman implements Person {

    private static final Logger LOGGER = LoggerFactory.getLogger(Woman.class);

    @Override
    public void sayHi() {
        LOGGER.info("i am woman");
    }
}
