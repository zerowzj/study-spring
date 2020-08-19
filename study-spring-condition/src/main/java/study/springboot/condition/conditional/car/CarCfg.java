package study.springboot.condition.conditional.car;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class CarCfg {

    @Conditional(AudiCondition.class)
    @Bean
    public Car audi() {
        return new Audi();
    }

    @Conditional(BenzCondition.class)
    @Bean
    public Car benz() {
        return new Benz();
    }
}
