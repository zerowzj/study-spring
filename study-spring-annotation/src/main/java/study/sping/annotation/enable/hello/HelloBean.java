package study.sping.annotation.enable.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloBean.class);

    private String name;

    public HelloBean(String name){
        this.name = name;
    }

    public void sayHi(){
        LOGGER.info("hello, {}", name);
    }
}
