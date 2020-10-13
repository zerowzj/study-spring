package study.springboot.condition.conditional_on.tt.none;

import org.springframework.boot.autoconfigure.condition.NoneNestedConditions;

public class OnNoneConditions extends NoneNestedConditions {

    public OnNoneConditions() {
        super(ConfigurationPhase.PARSE_CONFIGURATION);
    }
}
