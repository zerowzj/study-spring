package study.springboot.condition.conditional.car;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class AudiCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context,
                           AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        String brand = env.getProperty("car.brand");
        return "audi".equalsIgnoreCase(brand);
    }
}
