package study.springboot.condition.conditionalon.tt.or;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.AnyNestedCondition;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

@Slf4j
public class OnOrCondition extends AnyNestedCondition {

    public OnOrCondition(ConfigurationPhase configurationPhase) {
        super(ConfigurationPhase.REGISTER_BEAN);
    }

    @ConditionalOnClass
    static class OnWindows {
    }

    @ConditionalOnClass
    static class OnUnix {
    }
}
