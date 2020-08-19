package study.springboot.condition.enable.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloBeanCfg {

    @Bean
    public HelloBean helloBean() {
        return new HelloBean();
    }
}
