package study.sping.annotation.condition.person;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import study.sping.annotation.condition.person.condition.ManCondition;
import study.sping.annotation.condition.person.condition.WomanCondition;

@Configuration
public class PersonCfg {

    @Bean
    @Conditional(ManCondition.class)
    public Person man(){
        return new Man();
    }

    @Bean
    @Conditional(WomanCondition.class)
    public Person woman(){
        return new Woman();
    }
}
