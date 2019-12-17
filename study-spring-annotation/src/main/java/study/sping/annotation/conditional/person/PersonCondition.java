package study.sping.annotation.conditional.person;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class PersonCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext,
                           AnnotatedTypeMetadata annotatedTypeMetadata) {
        return false;
    }
}
