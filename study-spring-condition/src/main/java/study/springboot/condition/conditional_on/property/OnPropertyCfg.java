package study.springboot.condition.conditional_on.property;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class OnPropertyCfg {

    @Bean
    @ConditionalOnProperty(prefix = "car", name = "name", havingValue = "audi")
    public Car audi() {
        log.info(">>>>>>>>>> new audi");
        return new Audi();
    }

    @Bean
    @ConditionalOnProperty(prefix = "car", name = "name", havingValue = "benz")
    public Car benz() {
        log.info(">>>>>>>>>> new benz");
        return new Benz();
    }
}
