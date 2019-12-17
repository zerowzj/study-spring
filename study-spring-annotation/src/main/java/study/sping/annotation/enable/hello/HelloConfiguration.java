package study.sping.annotation.enable.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {

    @Bean
    public HelloBean hello(){
        return new HelloBean("wangzhj");
    }
}
