package study.springboot.condition.conditional_on.expression;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OnExpressionCfg {

    @Bean
    @ConditionalOnExpression("${animal.tiger}==1")
    public Animal tiger() {
        return new Tiger();
    }

    @Bean
    @ConditionalOnExpression("${animal.lion:true}")
    public Animal lion() {
        return new Lion();
    }


    @Bean
    @ConditionalOnExpression("'${animal.monkey}'.equals('ok')")
    public Monkey monkey() {
        return new Monkey();
    }
}
